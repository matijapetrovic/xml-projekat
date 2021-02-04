import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddZalbaOdlukaComponent } from './components/add-zalba-odluka/add-zalba-odluka.component';


const routes: Routes = [
  {
    path: 'add',
    component: AddZalbaOdlukaComponent 
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ZalbaOdlukaRoutingModule { }
