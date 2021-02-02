import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

const routes: Routes = [
  {
    path: 'obavestenje',
    loadChildren: () => import('./modules/obavestenje/obavestenje.module').then(m => m.ObavestenjeModule)
  },
  {
    path: '',
    redirectTo: 'obavestenje/add',
    pathMatch: 'full'
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
