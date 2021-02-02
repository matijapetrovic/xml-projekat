import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AddObavestenjeComponent } from './components/add-obavestenje/add-obavestenje.component';
import { ObavestenjeRoutingModule } from './obavestenje-routing.module';
import { XonomyModule } from 'projects/xonomy/src/public-api';
import { VendorsModule } from 'projects/vendors/src/projects';



@NgModule({
  declarations: [AddObavestenjeComponent],
  imports: [
    CommonModule,
    VendorsModule,
    XonomyModule,
    ObavestenjeRoutingModule
  ]
})
export class ObavestenjeModule { }
