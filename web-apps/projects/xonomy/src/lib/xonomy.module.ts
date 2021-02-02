import { NgModule } from '@angular/core';
import { XonomyComponent } from './xonomy.component';
import { XonomyDirective } from './xonomy.directive';



@NgModule({
  declarations: [XonomyComponent, XonomyDirective],
  imports: [
  ],
  exports: [XonomyComponent, XonomyDirective]
})
export class XonomyModule { }
