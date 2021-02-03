import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AddZahtevComponent } from './components/add-zahtev/add-zahtev.component';
import { ZahtevRoutingModule } from './zahtev-routing.module';
import { XonomyModule } from 'projects/xonomy/src/public-api';
import { VendorsModule } from 'projects/vendors/src/projects';



@NgModule({
  declarations: [AddZahtevComponent],
  imports: [
    CommonModule,
    VendorsModule,
    XonomyModule,
    ZahtevRoutingModule
  ]
})
export class ZahtevModule { }
