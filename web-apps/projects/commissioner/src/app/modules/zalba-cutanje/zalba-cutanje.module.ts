import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AddZalbaCutanjeComponent } from './components/add-zalba-cutanje/add-zalba-cutanje.component';
import { ZalbaCutanjeRoutingModule } from './zalba-cutanje-routing.module';
import { XonomyModule } from 'projects/xonomy/src/public-api';
import { VendorsModule } from 'projects/vendors/src/projects';



@NgModule({
  declarations: [AddZalbaCutanjeComponent],
  imports: [
    CommonModule,
    VendorsModule,
    XonomyModule,
    ZalbaCutanjeRoutingModule
  ]
})
export class ZalbaCutanjeModule { }
