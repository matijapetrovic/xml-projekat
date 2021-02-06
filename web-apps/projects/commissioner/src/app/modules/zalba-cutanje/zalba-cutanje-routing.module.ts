import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddZalbaCutanjeComponent } from './components/add-zalba-cutanje/add-zalba-cutanje.component';
import { ZalbeCutanjeViewComponent } from './components/zalbe-cutanje-view/zalbe-cutanje-view.component';


const routes: Routes = [
  {
    path: 'add/:zahtevId',
    component: AddZalbaCutanjeComponent 
  },
  {
    path: '',
    component: ZalbeCutanjeViewComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ZalbaCutanjeRoutingModule { }
