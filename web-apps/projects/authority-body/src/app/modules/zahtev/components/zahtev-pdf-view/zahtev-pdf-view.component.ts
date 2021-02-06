import { Component, OnInit } from '@angular/core';
import { XonomyService } from 'projects/xonomy/src/public-api';
import zahtevSpec from '../../zahtev-xonomy-spec';
import { ZahtevService } from '../../zahtev.service';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-zahtev-pdf-view',
  templateUrl: './zahtev-pdf-view.component.html',
  styleUrls: ['./zahtev-pdf-view.component.scss']
})
export class ZahtevPdfViewComponent implements OnInit {
  document: string;
  spec: any = zahtevSpec;

  constructor(
    private route: ActivatedRoute,
    private xonomyService: XonomyService,
    private zahtevService: ZahtevService,
    private router: Router) { }

  ngOnInit(): void {
    const id = +this.route.snapshot.params.id;
    this.getOne(id);
  }

  getOne(id: number) {
    this.zahtevService.getOneXHTML(id).subscribe((zahtev) => this.document = zahtev);
  }

}
