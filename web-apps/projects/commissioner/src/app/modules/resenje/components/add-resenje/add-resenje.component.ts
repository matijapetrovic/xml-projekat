import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { XonomyService } from 'projects/xonomy/src/public-api';
import resenjeSpec from '../../resenje-xonomy-spec';
import { ResenjeService } from '../../resenje.service';

@Component({
  selector: 'app-add-resenje',
  templateUrl: './add-resenje.component.html',
  styleUrls: ['./add-resenje.component.scss']
})
export class AddResenjeComponent implements OnInit {

  document: string;
  spec: any = resenjeSpec;

  zalbaId: number;

  tipZalbe: string;

  constructor(private xonomyService: XonomyService,
              private resenjeService: ResenjeService,
              route: ActivatedRoute,
              router: Router) {
                route.params.subscribe((params) => this.zalbaId = params['zalbaId']);
                if (router.url.includes('zalba-cutanje')) this.tipZalbe = 'zalba-cutanje';
                else if (router.url.includes('zalba-odluka')) this.tipZalbe = 'zalba-odluka';
              }

  ngOnInit(): void {
    this.resenjeService.getExample().subscribe((document) => this.document = document);
  }

  addResenje(): void {
    const document: string = this.xonomyService.getCurrentDocument();
    if (this.tipZalbe === 'zalba-cutanje')
      this.resenjeService.addCutanje(this.zalbaId, document);
    else if (this.tipZalbe == 'zalba-odluka')
      this.resenjeService.addOdluka(this.zalbaId, document);
  }

}
