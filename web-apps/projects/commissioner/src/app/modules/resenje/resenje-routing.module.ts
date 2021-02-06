import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AuthGuard } from '../../core/guards/auth.guard';
import { AddResenjeComponent } from './components/add-resenje/add-resenje.component';
import { ResenjaViewComponent } from './components/resenja-view/resenja-view.component';


const routes: Routes = [
  {
    path: 'add',
    component: AddResenjeComponent,

  },
  {
    path: '',
    component: ResenjaViewComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ResenjeRoutingModule { }
