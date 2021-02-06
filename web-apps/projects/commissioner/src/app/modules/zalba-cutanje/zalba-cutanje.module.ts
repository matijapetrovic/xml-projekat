import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AddZalbaCutanjeComponent } from './components/add-zalba-cutanje/add-zalba-cutanje.component';
import { ZalbaCutanjeRoutingModule } from './zalba-cutanje-routing.module';
import { XonomyModule } from 'projects/xonomy/src/public-api';
import { VendorsModule } from 'projects/vendors/src/projects';
import { FlexLayoutModule } from '@angular/flex-layout';
import { ReactiveFormsModule } from '@angular/forms';
import { SharedModule } from 'projects/authority-body/src/app/shared/shared.module';
import { ZalbeCutanjeViewComponent } from './components/zalbe-cutanje-view/zalbe-cutanje-view.component';
import { ZalbaCutanjeViewComponent } from './components/zalba-cutanje-view/zalba-cutanje-view.component';
import { ZalbaCutanjeXhtmlViewComponent } from './components/zalba-cutanje-xhtml-view/zalba-cutanje-xhtml-view.component';
import { UserZalbeCutanjeViewComponent } from './components/user-zalbe-cutanje-view/user-zalbe-cutanje-view.component';



@NgModule({
  declarations: [AddZalbaCutanjeComponent, ZalbeCutanjeViewComponent, ZalbaCutanjeViewComponent, ZalbaCutanjeXhtmlViewComponent, UserZalbeCutanjeViewComponent],
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
