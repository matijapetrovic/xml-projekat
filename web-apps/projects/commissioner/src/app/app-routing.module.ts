import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

const routes: Routes = [
  {
    path: 'resenje',
    loadChildren: () => import('./modules/resenje/resenje.module').then(m => m.ResenjeModule)
  },
  {
    path: 'zalba-cutanje',
    loadChildren: () => import('./modules/zalba-cutanje/zalba-cutanje.module').then(m => m.ZalbaCutanjeModule)
  },
  {
    path: 'zalba-odluka',
    loadChildren: () => import('./modules/zalba-odluka/zalba-odluka.module').then(m => m.ZalbaOdlukaModule)
  },
  {
    path: 'auth',
    loadChildren: () => import('./modules/authentication/authentication.module').then(m => m.AuthenticationModule),
  },
  {
    path: '',
    redirectTo: 'auth/login',
    pathMatch: 'full'
  },
  { path: '**', redirectTo: '' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
