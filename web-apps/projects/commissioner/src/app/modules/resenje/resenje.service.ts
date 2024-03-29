import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { HandleError, HttpErrorHandler } from 'projects/authority-body/src/app/core/services/http-error-handler.service';
import { environment } from 'projects/commissioner/src/environments/environment';
import { BehaviorSubject, Observable } from 'rxjs';
import { catchError, map } from 'rxjs/operators';
import * as converter from 'xml-js';

const postHeaders = new HttpHeaders({
  'Content-Type': 'application/xml'
});

@Injectable({
  providedIn: 'root'
})
export class ResenjeService {
  private url = `${environment.apiUrl}/resenje`;


  private handleError: HandleError;

  constructor( private http: HttpClient, httpErrorHandler: HttpErrorHandler
    ) { 
    this.handleError = httpErrorHandler.createHandleError('ZahteviService');
    }

    addCutanje(zalbaId: number, document: string): Observable<void> {
      return this.http.post<void>(`${this.url}/zalba-cutanje?zalbaId=${zalbaId}`, document, { headers: postHeaders });
    }

    addOdluka(zalbaId: number, document: string): Observable<void> {
      return this.http.post<void>(`${this.url}/zalba-odluka?zalbaId=${zalbaId}`, document, { headers: postHeaders });
    }

  getExample(): Observable<string> {
    return this.http.get(`${this.url}/example`, {headers: postHeaders, responseType: 'text'});
  }

  getAll(): Observable<Array<any>> {
    const url = `${this.url}`;
    return this.http.get(url, { responseType: 'text' })
    .pipe(
      map(dtoXML => {
        let res = JSON.parse(converter.xml2json(dtoXML.toString(), { compact: true, spaces: 2 }))['Resenja']['Resenje'];
        let resenja = (res instanceof Array ? res : [res]);
        return resenja;
      }));
  }

  getOne(id: string): Observable<string> {
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


}
