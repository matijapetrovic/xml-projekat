import { Component, OnInit } from '@angular/core';
import { XonomyService } from 'projects/xonomy/src/public-api';
import zahtevSpec from '../../zalba-odluka-xonomy-spec';
import { Router, ActivatedRoute } from '@angular/router';
import { ZalbaOdlukaService } from '../../zalba-odluka.service';


@Component({
  selector: 'app-zalba-odluka-xhtml-view',
  templateUrl: './zalba-odluka-xhtml-view.component.html',
  styleUrls: ['./zalba-odluka-xhtml-view.component.scss']
})
export class ZalbaOdlukaXhtmlViewComponent implements OnInit {
  document: string;
  spec: any = zahtevSpec;

  constructor(
    private route: ActivatedRoute,
    private xonomyService: XonomyService,
    private zalbaOdlukaService: ZalbaOdlukaService,
    private router: Router
  ) { }

  ngOnInit(): void {
    const id = this.route.snapshot.params.id;
    this.getOne(id);
  }

  getOne(id: string) {
    this.zalbaOdlukaService.getOneXHTML(id).subscribe((zahtev) => { this.document = zahtev; console.log(zahtev) });
  }
}
