import { Component, OnInit, ViewChild } from '@angular/core';

import { ZalbaCutanjeService } from '../../zalba-cutanje.service';
import { ZalbaCutanjeXonomyService } from './../../xonomy-services/zalba-cutanje-xonomy.service';
import { zalbaCutanjeXML } from './../../../core/xstl/zalba-cutanje-xml-string';

declare var Xonomy: any;

@Component({
  selector: 'app-zalba-cutanje',
  templateUrl: './zalba-cutanje.component.html',
  styleUrls: ['./zalba-cutanje.component.css']
})
export class ZalbaCutanjeComponent implements OnInit {
  

  @ViewChild('zalbaXonomy', { static: false })
  zalbaXonomy: any;
  @ViewChild('zalbaHTML', { static: false })
  zalbaHTML: any;

  constructor(
    private xonomyService: ZalbaCutanjeXonomyService,
    private service: ZalbaCutanjeService
  ) { 
  }

  ngOnInit(): void {
  }

  ngAfterViewInit(): void {
    let element = document.getElementById("zalbaCutanje");
    let xmlString = zalbaCutanjeXML;
    Xonomy.render(xmlString, element, {
      validate: this.xonomyService.validate,
      elements: this.xonomyService.getElements(),
      onchange: () => { this.onChange() }
    });
    this.onChange();
  }

  public submit(): void {
    console.log(Xonomy.harvest());
    this.service.addZalbaCutanje(Xonomy.harvest()).subscribe();
  }

  onChange() {
    this.zalbaHTML.nativeElement.innerHTML = this.xonomyService.convertToXSLT(Xonomy.harvest());
  }
}
