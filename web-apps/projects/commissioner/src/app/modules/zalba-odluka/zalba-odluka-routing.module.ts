import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddZalbaOdlukaComponent } from './components/add-zalba-odluka/add-zalba-odluka.component';
import { ZalbeOdlukaViewComponent } from './components/zalbe-odluka-view/zalbe-odluka-view.component';
import { ZalbaOdlukaViewComponent } from '../zalba-odluka/components/zalba-odluka-view/zalba-odluka-view.component';
import { ZalbaOdlukaXhtmlViewComponent } from '../zalba-odluka/components/zalba-odluka-xhtml-view/zalba-odluka-xhtml-view.component';

const routes: Routes = [
  {
    path: '',
    component: ZalbeOdlukaViewComponent
  },
  {
    path: 'add/:zahtevId',
    component: AddZalbaOdlukaComponent 
  },
  {
    path: ':id',
    component: ZalbaOdlukaViewComponent
  },
  {
    path: 'xhtml/:id',
    component: ZalbaOdlukaXhtmlViewComponent
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ZalbaOdlukaRoutingModule { }
