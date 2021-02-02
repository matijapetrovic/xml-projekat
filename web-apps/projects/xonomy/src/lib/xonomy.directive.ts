import { Directive, ElementRef, Input } from '@angular/core';
import { XonomyService } from './xonomy.service';

@Directive({
  selector: '[libXonomy]'
})
export class XonomyDirective {
  @Input()
  document: string;

  @Input('specification')
  spec: any;

  constructor(private el: ElementRef, private xonomyService: XonomyService) {
  }

  ngOnInit(): void {
    this.xonomyService.render(this.document, this.el.nativeElement, this.spec);
  }
}
