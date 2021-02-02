import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddObavestenjeComponent } from './components/add-obavestenje/add-obavestenje.component';


const routes: Routes = [
  {
    path: 'add',
    component: AddObavestenjeComponent 
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ObavestenjeRoutingModule { }
