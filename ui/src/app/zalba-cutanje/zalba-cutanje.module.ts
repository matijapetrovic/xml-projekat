import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ZalbacutanjeRoutingModule } from './zalba-cutanje-routing.module';
import { ZalbaCutanjeComponent } from './pages/zalba-cutanje/zalba-cutanje.component';
import { ZalbaCutanjeViewComponent } from './pages/zalba-cutanje-view/zalba-cutanje-view.component'
import { SharedModule } from '../shared/shared.module';

@NgModule({
  declarations: [ZalbaCutanjeComponent, ZalbaCutanjeViewComponent ],
  imports: [
    CommonModule,
    SharedModule,
    ZalbacutanjeRoutingModule,
  ]
})
export class ZalbaCutanjeModule { }
