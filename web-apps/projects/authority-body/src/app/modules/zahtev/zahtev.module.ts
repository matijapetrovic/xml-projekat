import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AddZahtevComponent } from './components/add-zahtev/add-zahtev.component';
import { ZahtevRoutingModule } from './zahtev-routing.module';
import { XonomyModule } from 'projects/xonomy/src/public-api';
import { VendorsModule } from 'projects/vendors/src/projects';
import { FlexLayoutModule } from '@angular/flex-layout';
import { ReactiveFormsModule } from '@angular/forms';
import { SharedModule } from  '../../shared/shared.module';
import { UserZahteviViewComponent } from './components/user-zahtevi-view/user-zahtevi-view.component';
import { ZahtevViewComponent } from './components/zahtev-view/zahtev-view.component';
import { ZahtevXhtmlViewComponent } from './components/zahtev-xhtml-view/zahtev-xhtml-view.component';
import { ZahteviViewComponent } from './components/zahtevi-view/zahtevi-view.component';


@NgModule({
  declarations: [AddZahtevComponent, ZahteviViewComponent, ZahtevViewComponent, UserZahteviViewComponent, ZahtevXhtmlViewComponent],
  imports: [
    CommonModule,
    VendorsModule,
    XonomyModule,
    ZahtevRoutingModule,
    FlexLayoutModule,
    ReactiveFormsModule,
    SharedModule,
  ]
})
export class ZahtevModule { }
