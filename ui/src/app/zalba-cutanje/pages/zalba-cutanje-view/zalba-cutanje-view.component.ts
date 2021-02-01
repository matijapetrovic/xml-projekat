import { Component, OnInit, ViewChild } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

import { ZalbaCutanjeService } from '../../zalba-cutanje.service';
import { ZalbaCutanjeXonomyService } from './../../xonomy-services/zalba-cutanje-xonomy.service'

@Component({
  selector: 'app-zalba-cutanje-view',
  templateUrl: './zalba-cutanje-view.component.html',
  styleUrls: ['./zalba-cutanje-view.component.css']
})
export class ZalbaCutanjeViewComponent implements OnInit {

  private id: any;
  private zalbaCutanje: string = '';

  @ViewChild('zalbaHTML', { static: false })
  zalbaHTML: any;

  constructor(
    private xonomyService: ZalbaCutanjeXonomyService,
    private service: ZalbaCutanjeService,
    private route: ActivatedRoute
  ) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.paramMap.get('id');
    // promeni posle kad putanja u zalba-cutanje-routing-module bude imala id kao parametar
    this.service.getZalbaCutanje(1).subscribe(res => {
      this.zalbaCutanje = res;
      this.zalbaHTML.nativeElement.innerHTML = this.xonomyService.convertToXSLT(this.zalbaCutanje);
    });
    
  }

  ngAfterViewInit(): void {
    this.zalbaHTML.nativeElement.innerHTML = this.xonomyService.convertToXSLT(this.zalbaCutanje);
  }
}
