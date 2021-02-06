import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'projects/authority-body/src/environments/environment';
import { Observable } from 'rxjs';
import { HandleError, HttpErrorHandler } from '../../core/services/http-error-handler.service';
import { catchError, map, tap } from 'rxjs/operators';
import * as JsonToXML from "js2xmlparser";
import * as converter from 'xml-js';

const postHeaders = new HttpHeaders({
  'Content-Type': 'application/xml'
});

@Injectable({
  providedIn: 'root'
})
export class ZahtevService {
  private url = `${environment.apiUrl}/zahtev`;

  private handleError: HandleError;

  constructor( private http: HttpClient, httpErrorHandler: HttpErrorHandler
    ) { 
    this.handleError = httpErrorHandler.createHandleError('ZahteviService');
    }

  add(document: string): Observable<void> {
    return this.http.post<void>(this.url, document, { headers: postHeaders });
  }

  getExample(): Observable<string> {
    return this.http.get(`${this.url}/example`, {responseType: 'text'});
  }
  
  getAll(): Observable<Array<any>> {
    const url = `${this.url}`;
    return this.http.get(url, { responseType: 'text' })
    .pipe(
      map(dtoXML => {
        let res = JSON.parse(converter.xml2json(dtoXML.toString(), { compact: true, spaces: 2 }))['Zahtevi']['Zahtev'];
        return (res instanceof Array ? res : [res]);
      }));
  }

  getOne(id: string): Observable<string> {
    console.log(id);
    const url = `${this.url}/${id}`;
    return this.http.get(url, { headers: new HttpHeaders().append('Accept', 'application/xml'), responseType: 'text'})
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

  deleteZahtev(id: string): Observable<{}> {
    const url = `${this.url}/${id}`;
    return this.http.delete(url, { headers: postHeaders })
      .pipe(
        catchError(this.handleError('deleteZahtev'))
      );
  }
}
