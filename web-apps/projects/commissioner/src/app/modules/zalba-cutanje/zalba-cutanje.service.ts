import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'projects/commissioner/src/environments/environment';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import * as converter from 'xml-js';

const postHeaders = new HttpHeaders({
  'Content-Type': 'application/xml'
});

@Injectable({
  providedIn: 'root'
})
export class ZalbaCutanjeService {

  private url = `${environment.apiUrl}/zalba-cutanje`;

  constructor(private http: HttpClient) { }

  getAll(): Observable<Array<any>> {
    const url = `${this.url}`;
    return this.http.get(url, { responseType: 'text' })
    .pipe(
      map(dtoXML => {
        let res = JSON.parse(converter.xml2json(dtoXML.toString(), { compact: true, spaces: 2 }))['ZalbeNaCutanje']['ZalbaNaCutanje'];
        return (res instanceof Array ? res : [res]);
      }));
  }

  add(zahtevId: number, document: string): Observable<void> {
    return this.http.post<void>(`${this.url}/?zahtevId=${zahtevId}`, document, { headers: postHeaders });
  }

  getExample(): Observable<string> {
    return this.http.get(`${this.url}/example`, {responseType: 'text'});
  }

}
