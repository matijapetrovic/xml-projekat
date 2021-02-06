import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddZalbaOdlukaComponent } from './components/add-zalba-odluka/add-zalba-odluka.component';
import { ZalbeOdlukaViewComponent } from './components/zalbe-odluka-view/zalbe-odluka-view.component';
import { ZalbaOdlukaViewComponent } from '../zalba-odluka/components/zalba-odluka-view/zalba-odluka-view.component';
import { ZalbaOdlukaXhtmlViewComponent } from '../zalba-odluka/components/zalba-odluka-xhtml-view/zalba-odluka-xhtml-view.component';
import { UserZalbeOdlukaViewComponent } from '../zalba-odluka/components/user-zalbe-odluka-view/user-zalbe-odluka-view.component';
import { AuthGuard } from 'projects/authority-body/src/app/core/guards/auth.guard';

const routes: Routes = [
  {
    path: '',
    component: ZalbeOdlukaViewComponent,
    canActivate: [AuthGuard],
    data: { roles: ['ROLE_COMMISSIONER'] }
  },
  {
    path: 'add/:zahtevId',
    component: AddZalbaOdlukaComponent,
    canActivate: [AuthGuard],
    data: { roles: ['ROLE_USER'] }
  },
  {
    path: ':id',
    component: ZalbaOdlukaViewComponent
  },
  {
    path: 'xhtml/:id',
    component: ZalbaOdlukaXhtmlViewComponent
  },
  {
    path: 'gradjanin',
    component: UserZalbeOdlukaViewComponent,
    canActivate: [AuthGuard],
    data: { roles: ['ROLE_USER'] }
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ZalbaOdlukaRoutingModule { }
