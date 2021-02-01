import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { catchError } from 'rxjs/operators';
import { HandleError, HttpErrorHandler } from 'src/app/core/services/http-error-handler.service';
import { environment } from 'src/environments/environment';

const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type': 'application/xml',
  })
};

@Injectable({
  providedIn: 'root'
})
export class ZalbaCutanjeService {
  zalbaCutanjeUrl = `${environment.commissionerApiUrl}/zalba-cutanje`;
  private handleError: HandleError;

  constructor(private http: HttpClient, httpErrorHandler: HttpErrorHandler) {
    this.handleError = httpErrorHandler.createHandleError('ZalbaCutanjeService');
  }

  getZalbaCutanje(id: number): Observable<any> {
    const url = `${this.zalbaCutanjeUrl}/${id}`;
    return this.http.get(url, { responseType: 'text' })
      .pipe(
        catchError(this.handleError<any>('getZalbaCutanje')
        )
      );
  }

  addZalbaCutanje(entity: any): Observable<void> {
    const url = `${this.zalbaCutanjeUrl}`;
    return this.http.post<void>(url, entity, httpOptions)
      .pipe(
        catchError(this.handleError<void>('postZalbaCutanje')
        )
      );
  }
}
