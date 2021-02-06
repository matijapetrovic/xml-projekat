import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddZahtevComponent } from './components/add-zahtev/add-zahtev.component';
import { ZahteviViewComponent } from './components/zahtevi-view/zahtevi-view.component';
import { ZahtevViewComponent } from './components/zahtev-view/zahtev-view.component';
import { ZahtevXhtmlViewComponent } from './components/zahtev-xhtml-view/zahtev-xhtml-view.component';
import { UserZahteviViewComponent } from './components/user-zahtevi-view/user-zahtevi-view.component';
import { AuthGuard } from '../../core/guards/auth.guard';

const routes: Routes = [
  
  {
    path: '',
    component: ZahteviViewComponent,
    canActivate: [AuthGuard],
    data: { roles: ['ROLE_AUTHORITY_BODY'] }
  },
  {
    path: 'user',
    component: UserZahteviViewComponent,
    canActivate: [AuthGuard],
    data: { roles: ['ROLE_USER'] }
  },
  {
    path: 'add',
    component: AddZahtevComponent,
    canActivate: [AuthGuard],
    data: { roles: ['ROLE_USER'] } 
  },
  {
    path: ':id',
    component: ZahtevViewComponent
  },
  {
    path: 'xhtml/:id',
    component: ZahtevXhtmlViewComponent
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ZahtevRoutingModule { }
