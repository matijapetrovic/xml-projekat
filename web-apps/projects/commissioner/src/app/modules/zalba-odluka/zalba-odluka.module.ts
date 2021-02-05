import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AddZalbaOdlukaComponent } from './components/add-zalba-odluka/add-zalba-odluka.component';
import { ZalbaOdlukaRoutingModule } from './zalba-odluka-routing.module';
import { XonomyModule } from 'projects/xonomy/src/public-api';
import { VendorsModule } from 'projects/vendors/src/projects';


@NgModule({
  declarations: [AddZalbaOdlukaComponent],
  imports: [
    CommonModule,
    VendorsModule,
    XonomyModule,
    ZalbaOdlukaRoutingModule
  ]
})
export class ZalbaOdlukaModule { }
