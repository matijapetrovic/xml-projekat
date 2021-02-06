import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { XonomyService } from 'projects/xonomy/src/public-api';
import obavestenjeSpec from '../../obavestenje-xonomy-spec';
import { ObavestenjeService } from '../../obavestenje.service';

@Component({
  selector: 'app-add-obavestenje',
  templateUrl: './add-obavestenje.component.html',
  styleUrls: ['./add-obavestenje.component.scss']
})
export class AddObavestenjeComponent implements OnInit {
  document: string;
  spec: any = obavestenjeSpec;

  zahtevId: number;

  constructor(private xonomyService: XonomyService,
              private obavestenjeService: ObavestenjeService,
              route: ActivatedRoute) {
                route.params.subscribe((params) => this.zahtevId = params['zahtevId']);
               }

  ngOnInit(): void {
    this.obavestenjeService.getExample().subscribe((document) => this.document = document);
  }

  addObavestenje(): void {
    const document: string = this.xonomyService.getCurrentDocument();
    this.obavestenjeService.add(this.zahtevId, document).subscribe(() => {
      console.log('ide gas dodato max');
    })
  }

}
