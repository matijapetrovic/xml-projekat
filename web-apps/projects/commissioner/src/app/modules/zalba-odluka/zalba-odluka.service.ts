import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'projects/authority-body/src/environments/environment';
import { Observable } from 'rxjs';

const postHeaders = new HttpHeaders({
  'Content-Type': 'application/xml'
});

@Injectable({
  providedIn: 'root'
})
export class ZalbaOdlukaService {

  private url = `${environment.apiUrl}/zalba-odluka`;

  constructor(private http: HttpClient) { }

  add(document: string): Observable<void> {
    return this.http.post<void>(this.url, document, { headers: postHeaders });
  }

  getExample(): Observable<string> {
    return this.http.get(`${this.url}/example`, {responseType: 'text'});
  }
}