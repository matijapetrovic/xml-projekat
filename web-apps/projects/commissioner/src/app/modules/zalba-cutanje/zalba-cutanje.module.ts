import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AddZalbaCutanjeComponent } from './components/add-zalba-cutanje/add-zalba-cutanje.component';
import { ZalbaCutanjeRoutingModule } from './zalba-cutanje-routing.module';
import { XonomyModule } from 'projects/xonomy/src/public-api';
import { VendorsModule } from 'projects/vendors/src/projects';
import { FlexLayoutModule } from '@angular/flex-layout';
import { ReactiveFormsModule } from '@angular/forms';
import { SharedModule } from 'projects/authority-body/src/app/shared/shared.module';



@NgModule({
  declarations: [AddZalbaCutanjeComponent],
  imports: [
    CommonModule,
    VendorsModule,
    XonomyModule,
    ZalbaCutanjeRoutingModule,
    FlexLayoutModule,
    ReactiveFormsModule,
    SharedModule
  ]
})
export class ZalbaCutanjeModule { }
