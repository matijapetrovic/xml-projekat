import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AuthGuard } from '../../core/guards/auth.guard';
import { AddResenjeComponent } from './components/add-resenje/add-resenje.component';


const routes: Routes = [
  {
    path: 'add',
    component: AddResenjeComponent,

  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ResenjeRoutingModule { }
