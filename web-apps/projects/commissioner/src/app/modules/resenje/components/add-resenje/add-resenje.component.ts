import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
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

  zahtevId: number;

  constructor(private xonomyService: XonomyService,
              private resenjeService: ResenjeService){}
              // route: ActivatedRoute) {
              //   route.params.subscribe((params) => this.zahtevId = params['zahtevId']);
              //  }

  ngOnInit(): void {
    this.resenjeService.getExample().subscribe((document) => this.document = document);
  }

  addResenje(): void {
    const document: string = this.xonomyService.getCurrentDocument();

  }

}
