import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddZalbaCutanjeComponent } from './components/add-zalba-cutanje/add-zalba-cutanje.component';
import { ZalbeCutanjeViewComponent } from './components/zalbe-cutanje-view/zalbe-cutanje-view.component';
import { ZalbaCutanjeViewComponent } from '../zalba-cutanje/components/zalba-cutanje-view/zalba-cutanje-view.component';
import { ZalbaCutanjeXhtmlViewComponent } from '../zalba-cutanje/components/zalba-cutanje-xhtml-view/zalba-cutanje-xhtml-view.component';

const routes: Routes = [
  {
    path: 'add/:zahtevId',
    component: AddZalbaCutanjeComponent 
  },
  {
    path: '',
    component: ZalbeCutanjeViewComponent
  },
  {
    path: ':id',
    component: ZalbaCutanjeViewComponent
  },
  {
    path: 'xhtml/:id',
    component: ZalbaCutanjeXhtmlViewComponent
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ZalbaCutanjeRoutingModule { }
