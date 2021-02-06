import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { BehaviorSubject, Observable } from 'rxjs';
import { catchError, map, tap } from 'rxjs/operators';

import { environment } from '../../../environments/environment';
import { User } from './user';
import { Router } from '@angular/router';
import { RegisterRequest } from './register';
import { HandleError, HttpErrorHandler } from '../../core/services/http-error-handler.service';
import { Role } from './role';
import * as JsonToXML from "js2xmlparser";
import * as converter from 'xml-js';

const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type': 'application/xml',
  })
};


@Injectable({ providedIn: 'root' })
export class AuthenticationService {
  authenticationUrl = `${environment.apiUrl}/api/auth`;

  private handleError: HandleError;

  private currentUserSubject: BehaviorSubject<User>;
  public currentUser: Observable<User>;

  private getUserFromLocalStorage(): User {
    const user = JSON.parse(localStorage.getItem('currentUser'));
    if (!user) {
      return null;
    }
    user.role = Role[user.role._text];
    return user;
  }

  constructor(private http: HttpClient, private router: Router, httpErrorHandler: HttpErrorHandler) {
    this.handleError = httpErrorHandler.createHandleError('AuthenticationService');
    this.currentUserSubject = new BehaviorSubject<User>(this.getUserFromLocalStorage());
    this.currentUser = this.currentUserSubject.asObservable();
  }

  public get currentUserValue(): User {
    return this.currentUserSubject.value;
  }

  isAuthenticated(): boolean {
    return this.currentUserSubject.value != null;
  }

  login(username: string, password: string): Observable<User> {
    const reqBody = { username, password };
    return this.http.post(`${this.authenticationUrl}/login`, JsonToXML.parse('root', reqBody), { ...httpOptions, responseType: 'text' })
      .pipe(
        catchError(this.handleError<string>('login')),
        map(dtoXML => {
          let userInfo: User = JSON.parse(converter.xml2json(dtoXML.toString(), { compact: true, spaces: 2 }))['LoginDTO'];
          if (userInfo && userInfo.token) {
            localStorage.setItem('currentUser', JSON.stringify(userInfo));
            this.currentUserSubject.next(this.getUserFromLocalStorage());
          }
          return userInfo;
        }));
  }

  logout(): void {
    localStorage.removeItem('currentUser');
    this.currentUserSubject.next(null);
    this.router.navigate(['']);
  }

  register(registerRequest: RegisterRequest): Observable<string> {
    const url = `${this.authenticationUrl}/register`;
    return this.http.post(url, JsonToXML.parse('root', registerRequest), { ...httpOptions, responseType: 'text' })
      .pipe(
        catchError(this.handleError<string>('postRegisterRequest')
        )
      );
  }
}
