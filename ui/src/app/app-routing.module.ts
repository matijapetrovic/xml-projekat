import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

const routes: Routes = [
  {
    path: 'zalba-cutanje',
    loadChildren: () => import('./zalba-cutanje/zalba-cutanje.module').then(m => m.ZalbaCutanjeModule),
  },
  {
    path: '',
    // redirectTo: 'home',
    redirectTo: 'zalba-cutanje',
    pathMatch: "full",
  },
  { path: '**', redirectTo: 'zalba-cutanje' }
];


@NgModule({
  imports: [RouterModule.forRoot(routes, { relativeLinkResolution: 'legacy' })],
  exports: [RouterModule]
})
export class AppRoutingModule { }
