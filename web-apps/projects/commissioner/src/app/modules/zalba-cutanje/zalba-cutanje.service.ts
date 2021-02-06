import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'projects/commissioner/src/environments/environment';
import { Observable } from 'rxjs';
import { catchError, map } from 'rxjs/operators';
import * as converter from 'xml-js';
import { HandleError, HttpErrorHandler } from '../../core/services/http-error-handler.service';
import { BehaviorSubject } from 'rxjs';

const postHeaders = new HttpHeaders({
  'Content-Type': 'application/xml'
});

@Injectable({
  providedIn: 'root'
})
export class ZalbaCutanjeService {

  private url = `${environment.apiUrl}/zalba-cutanje`;

  private zalbeSubject: BehaviorSubject<Array<any>>;
  public zalbe: Observable<Array<any>>;

  private handleError: HandleError;

  constructor( private http: HttpClient, httpErrorHandler: HttpErrorHandler
    ) { 
    this.handleError = httpErrorHandler.createHandleError('ZahteviService');
    this.zalbeSubject = new BehaviorSubject<Array<any>>([]);  
    this.zalbe = this.zalbeSubject.asObservable();
  }

  getAll(): Observable<Array<any>> {
    const url = `${this.url}`;
    return this.http.get(url, { responseType: 'text' })
    .pipe(
      map(dtoXML => {
        let res = JSON.parse(converter.xml2json(dtoXML.toString(), { compact: true, spaces: 2 }))['ZalbeNaCutanje']['ZalbaNaCutanje'];
        let zalbe = (res instanceof Array ? res : [res]);
        this.zalbeSubject.next(zalbe);
        return zalbe;
      }));
  }

  add(zahtevId: string, document: string): Observable<void> {
    return this.http.post<void>(`${this.url}/?zahtevId=${zahtevId}`, document, { headers: postHeaders });
  }

  getExample(): Observable<string> {
    return this.http.get(`${this.url}/example`, {responseType: 'text'});
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

  searchMetadata(searchReq: any): Observable<Array<any>> {
    const url = `${this.url}/search/metadata`;

    let request = '<ZalbaNaCutanjeMetadataSearchRequest>';

    if (searchReq.nazivOrganaVlasti)
      request += `<NazivOrganaVlasti>${searchReq.nazivOrganaVlasti}</NazivOrganVlasti>`;
    if (searchReq.imePodnosioca)
      request += `<ImePodnosioca>${searchReq.imePodnosioca}</ImePodnosioca>`;
    if (searchReq.prezimePodnosioca)
      request += `<PrezimePodnosioca>${searchReq.prezimePodnosioca}</PrezimePodnosioca>`;
    if (searchReq.podnesenU)
      request += `<PodnesenU>${searchReq.podnesenU}</PodnesenU>`;
    if (searchReq.podnesenDatuma)
      request += `<PodnesenDatuma>${searchReq.podnesenDatuma}</PodnesenDatuma>`;
    request += '</ZalbaNaCutanjeMetadataSearchRequest>';
    return this.http.post(url, request, { headers: new HttpHeaders({ 'Content-Type': 'application/xml', 'Accept': 'application/xml' }), responseType: 'text' })
      .pipe(
        map(dtoXML => {
          let res = JSON.parse(converter.xml2json(dtoXML.toString(), { compact: true, spaces: 2 }))['ZalbeNaCutanje']['ZalbaNaCutanje'];
          let zahtevi = (res instanceof Array ? res : [res]);
          this.zalbeSubject.next(zahtevi);
          console.log(zahtevi);
          return zahtevi;
        }));
  }
}
