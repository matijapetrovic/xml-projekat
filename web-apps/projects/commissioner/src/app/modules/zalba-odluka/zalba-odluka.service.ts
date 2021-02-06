import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'projects/commissioner/src/environments/environment';
import { Observable } from 'rxjs';
import { catchError, map } from 'rxjs/operators';
import * as converter from 'xml-js';
import { HandleError, HttpErrorHandler } from '../../core/services/http-error-handler.service';

const postHeaders = new HttpHeaders({
  'Content-Type': 'application/xml'
});

@Injectable({
  providedIn: 'root'
})
export class ZalbaOdlukaService {

  private url = `${environment.apiUrl}/zalba-odluka`;

  constructor(private http: HttpClient) { }

  private handleError: HandleError;

  add(zahtevId: string, document: string): Observable<void> {
    return this.http.post<void>(`${this.url}/?zahtevId=${zahtevId}`, document, { headers: postHeaders });
  }

  getExample(): Observable<string> {
    return this.http.get(`${this.url}/example`, {responseType: 'text'});
  }

  getAll(): Observable<Array<any>> {
    const url = `${this.url}`;
    return this.http.get(url, { responseType: 'text' })
      .pipe(
        map(dtoXML => {
          let res = JSON.parse(converter.xml2json(dtoXML.toString(), { compact: true, spaces: 2 }))['ZalbeNaOdluku']['ZalbaNaOdluku'];
          return (res instanceof Array ? res : [res]);
        }));
  }

  getOne(id: string): Observable<string> {
    const url = `${this.url}/${id}`;
    return this.http.get(url, { headers: new HttpHeaders().append('Accept', 'application/xml'), responseType: 'text' })
      .pipe(
        catchError(this.handleError<string>('getOne'))
      );
  }

  getOneXHTML(id: string): Observable<string> {
    const url = `${this.url}/${id}`;
    return this.http.get(url, { headers: new HttpHeaders().append('Accept', 'application/xhtml+xml'), responseType: 'text' })
      .pipe(
        catchError(this.handleError<string>('getOneXHTML'))
      );
  }

  getOnePDF(id: string): Observable<any> {
    const url = `${this.url}/${id}`;
    return this.http.get(url, { headers: new HttpHeaders().append('Accept', 'application/pdf'), responseType: 'arraybuffer' })
      .pipe(
        catchError(this.handleError<string>('getOnePDF'))
      );
  }
}
