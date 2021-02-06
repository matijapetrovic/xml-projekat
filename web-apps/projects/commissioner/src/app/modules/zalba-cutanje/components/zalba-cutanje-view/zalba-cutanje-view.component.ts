import { Component, OnInit } from '@angular/core';
import { XonomyService } from 'projects/xonomy/src/public-api';
import { Router, ActivatedRoute } from '@angular/router';
import zahtevSpec from '../../zalba-cutanje-xonomy-spec';
import { ZalbaCutanjeService } from '../../zalba-cutanje.service';


@Component({
  selector: 'app-zalba-cutanje-view',
  templateUrl: './zalba-cutanje-view.component.html',
  styleUrls: ['./zalba-cutanje-view.component.scss']
})
export class ZalbaCutanjeViewComponent implements OnInit {

  document: string;
  spec: any = zahtevSpec;

  constructor(
    private route: ActivatedRoute,
    private xonomyService: XonomyService,
    private zalbaCutanjeService: ZalbaCutanjeService,
    private router: Router
  ) { }

  ngOnInit(): void {
    const id = this.route.snapshot.params.id;
    this.getOne(id);
  }

  getOne(id: string) {
    this.zalbaCutanjeService.getOne(id).subscribe((zahtev) => this.document = zahtev);
  }

}
