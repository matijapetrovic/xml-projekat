import { Component, OnInit } from '@angular/core';
import {MenuItem} from 'primeng/api';
import { AuthenticationService } from '../../../modules/authentication/authentication.service';
import { Role } from '../../../modules/authentication/role';
import { User } from '../../../modules/authentication/user';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.scss']
})
export class HeaderComponent implements OnInit {

  items: MenuItem[];

  authenticated: boolean;

  commonItems: MenuItem[] = [
    {
      label: 'Pocetna',
      icon: 'pi pi-home',
      routerLink: [''],
      id: 'home-nav-link'
    },
  ];

  userItems: MenuItem[] = [
    {
      label: 'Pregledaj podnete zahteve',
      icon: 'pi pi-home',
      routerLink: ['/zahtevi/user'],
      id: 'home-nav-link'
    }
  ];

  adminItems: MenuItem[] = [
    {
      label: 'Pregledaj podnete zahteve',
      icon: 'pi pi-home',
      routerLink: ['/zahtevi'],
      id: 'home-nav-link'
    }
  ];

  unauthenticatedItems: MenuItem[] = [
    {
      label: 'Prijava',
      routerLink: ['/auth/login'],
      id: 'login-nav-link'
    },
    {
      label: 'Registracija',
      routerLink: ['/auth/register'],
      id: 'register-nav-link'
    },
  ];

  constructor(private authenticationService: AuthenticationService) { }

  ngOnInit(): void {
    this.authenticationService.currentUser.subscribe(user => this.updateItems(user));
  }

  updateItems(user: User): void {
    if (!!user) {
      this.authenticated = true;
      if (user.role === 'ROLE_AUTHORITY_BODY') {
        this.items = [
          ...this.commonItems,
          ...this.adminItems
        ];
      }
      else if (user.role === 'ROLE_USER') {
        this.items = [
          ...this.commonItems,
          ...this.userItems
        ];
      }
    }
    else {
      this.authenticated = false;
      this.items = [
        ...this.commonItems,
        ...this.unauthenticatedItems
      ];
    }
  }

  logout(): void {
    this.authenticationService.logout();
  }
}

