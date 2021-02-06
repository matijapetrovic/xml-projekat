import { Component, OnInit } from '@angular/core';
import { XonomyService } from 'projects/xonomy/src/public-api';
import zahtevSpec from '../../zalba-cutanje-xonomy-spec';
import { Router, ActivatedRoute } from '@angular/router';
import { ZalbaCutanjeService } from '../../zalba-cutanje.service';


@Component({
  selector: 'app-zalba-cutanje-xhtml-view',
  templateUrl: './zalba-cutanje-xhtml-view.component.html',
  styleUrls: ['./zalba-cutanje-xhtml-view.component.scss']
})
export class ZalbaCutanjeXhtmlViewComponent implements OnInit {
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
    this.zalbaCutanjeService.getOneXHTML(id).subscribe((zahtev) => { this.document = zahtev; console.log(zahtev) });
  }
}
