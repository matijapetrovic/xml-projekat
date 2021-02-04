import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddZahtevComponent } from './components/add-zahtev/add-zahtev.component';


const routes: Routes = [
  {
    path: 'add',
    component: AddZahtevComponent 
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ZahtevRoutingModule { }
