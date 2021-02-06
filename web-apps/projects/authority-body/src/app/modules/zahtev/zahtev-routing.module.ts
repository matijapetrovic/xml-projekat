import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddZahtevComponent } from './components/add-zahtev/add-zahtev.component';
import { ZahteviViewComponent } from './components/zahtevi-view/zahtevi-view.component';
import { ZahtevViewComponent } from './components/zahtev-view/zahtev-view.component';
import { ZahtevXhtmlViewComponent } from './components/zahtev-xhtml-view/zahtev-xhtml-view.component';
import { ZahtevPdfViewComponent } from './components/zahtev-pdf-view/zahtev-pdf-view.component';
import { UserZahteviViewComponent } from './components/user-zahtevi-view/user-zahtevi-view.component';

const routes: Routes = [
  
  {
    path: '',
    component: ZahteviViewComponent
  },
  {
    path: 'user',
    component: UserZahteviViewComponent
  },
  {
    path: 'add',
    component: AddZahtevComponent 
  },
  {
    path: ':id',
    component: ZahtevViewComponent
  },
  {
    path: 'xhtml/:id',
    component: ZahtevXhtmlViewComponent
  },
  {
    path: 'pdf/:id',
    component: ZahtevPdfViewComponent
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ZahtevRoutingModule { }
