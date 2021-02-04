import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

const routes: Routes = [
  {
    path: 'obavestenje',
    loadChildren: () => import('./modules/obavestenje/obavestenje.module').then(m => m.ObavestenjeModule)
  },
  {
    path: 'auth',
    loadChildren: () => import('./modules/authentication/authentication.module').then(m => m.AuthenticationModule),
  },
  {
    path: 'zahtev',
    loadChildren: () => import('./modules/zahtev/zahtev.module').then(m => m.ZahtevModule)
  },
  {
    path: '',
    redirectTo: 'obavestenje/add',
    pathMatch: 'full'
  },
  { path: '**', redirectTo: '' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
