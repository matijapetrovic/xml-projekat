import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AddResenjeComponent } from './components/add-resenje/add-resenje.component';
import { XonomyModule } from 'projects/xonomy/src/public-api';
import { VendorsModule } from 'projects/vendors/src/projects';
import { ResenjeRoutingModule } from './resenje-routing.module';
import { ResenjaViewComponent } from './components/resenja-view/resenja-view.component';



@NgModule({
  declarations: [AddResenjeComponent, ResenjaViewComponent],
  imports: [
    CommonModule,
    VendorsModule,
    XonomyModule,
    ResenjeRoutingModule
  ]
})
export class ResenjeModule { }
