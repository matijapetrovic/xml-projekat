import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AuthGuard } from '../../core/guards/auth.guard';
import { AddObavestenjeComponent } from './components/add-obavestenje/add-obavestenje.component';


const routes: Routes = [
  {
    path: 'add/:zahtevId',
    component: AddObavestenjeComponent,
    canActivate: [AuthGuard],
    data: { roles: ['ROLE_AUTHORITY_BODY'] }
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ObavestenjeRoutingModule { }
