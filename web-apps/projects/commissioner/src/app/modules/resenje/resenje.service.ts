import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'projects/commissioner/src/environments/environment';
import { Observable } from 'rxjs';

const postHeaders = new HttpHeaders({
  'Content-Type': 'application/xml'
});

@Injectable({
  providedIn: 'root'
})
export class ResenjeService {

  private url = `${environment.apiUrl}/resenje`;

  constructor(private http: HttpClient) { }

  // add(zahtevId: number, document: string): Observable<void> {
  //   return this.http.post<void>(`${this.url}/?zahtevId=${zahtevId}`, document, { headers: postHeaders });
  // }

  getExample(): Observable<string> {
    return this.http.get(`${this.url}/example`, {headers: postHeaders, responseType: 'text'});
  }
}
