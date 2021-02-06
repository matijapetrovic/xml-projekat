import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AddZalbaOdlukaComponent } from './components/add-zalba-odluka/add-zalba-odluka.component';
import { ZalbaOdlukaRoutingModule } from './zalba-odluka-routing.module';
import { XonomyModule } from 'projects/xonomy/src/public-api';
import { VendorsModule } from 'projects/vendors/src/projects';
import { ZalbeOdlukaViewComponent } from './components/zalbe-odluka-view/zalbe-odluka-view.component';
import { ZalbaOdlukaViewComponent } from './components/zalba-odluka-view/zalba-odluka-view.component';
import { ZalbaOdlukaXhtmlViewComponent } from './components/zalba-odluka-xhtml-view/zalba-odluka-xhtml-view.component';
import { UserZalbeOdlukaViewComponent } from './components/user-zalbe-odluka-view/user-zalbe-odluka-view.component';


@NgModule({
  declarations: [AddZalbaOdlukaComponent, ZalbeOdlukaViewComponent, ZalbaOdlukaViewComponent, ZalbaOdlukaXhtmlViewComponent, UserZalbeOdlukaViewComponent],
  imports: [
    CommonModule,
    VendorsModule,
    XonomyModule,
    ZalbaOdlukaRoutingModule
  ]
})
export class ZalbaOdlukaModule { }
