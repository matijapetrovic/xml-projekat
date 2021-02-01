import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ZalbaCutanjeComponent } from './pages/zalba-cutanje/zalba-cutanje.component';
import { ZalbaCutanjeViewComponent } from './pages/zalba-cutanje-view/zalba-cutanje-view.component';


const routes: Routes = [
  {
    // path: '/:id',
    path: '/a',
    component: ZalbaCutanjeViewComponent
  },
  {
    path: '',
    component: ZalbaCutanjeComponent
  }
]

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ZalbacutanjeRoutingModule { }
