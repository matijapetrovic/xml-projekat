import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AuthGuard } from '../../core/guards/auth.guard';
import { AddZalbaCutanjeComponent } from './components/add-zalba-cutanje/add-zalba-cutanje.component';
import { UserZalbeCutanjeViewComponent } from './components/user-zalbe-cutanje-view/user-zalbe-cutanje-view.component';
import { ZalbaCutanjeViewComponent } from './components/zalba-cutanje-view/zalba-cutanje-view.component';
import { ZalbaCutanjeXhtmlViewComponent } from './components/zalba-cutanje-xhtml-view/zalba-cutanje-xhtml-view.component';
import { ZalbeCutanjeViewComponent } from './components/zalbe-cutanje-view/zalbe-cutanje-view.component';

const routes: Routes = [
  {
    path: 'add/:zahtevId',
    component: AddZalbaCutanjeComponent,
    canActivate: [AuthGuard],
    data: { roles: ['ROLE_USER'] }
  },
  {
    path: '',
    component: ZalbeCutanjeViewComponent,
    canActivate: [AuthGuard],
    data: { roles: ['ROLE_COMMISSIONER'] }
  },
  {
    path: ':id',
    component: ZalbaCutanjeViewComponent
  },
  {
    path: 'xhtml/:id',
    component: ZalbaCutanjeXhtmlViewComponent
  },
  {
    path: 'gradjanin',
    component: UserZalbeCutanjeViewComponent,
    canActivate: [AuthGuard],
    data: { roles: ['ROLE_USER'] }
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ZalbaCutanjeRoutingModule { }
