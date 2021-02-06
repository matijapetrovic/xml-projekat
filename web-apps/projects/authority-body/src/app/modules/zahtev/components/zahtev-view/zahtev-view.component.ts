import { Component, OnInit } from '@angular/core';
import { XonomyService } from 'projects/xonomy/src/public-api';
import zahtevSpec from '../../zahtev-xonomy-spec';
import { ZahtevService } from '../../zahtev.service';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-zahtev-view',
  templateUrl: './zahtev-view.component.html',
  styleUrls: ['./zahtev-view.component.scss']
})
export class ZahtevViewComponent implements OnInit {
  document: string;
  spec: any = zahtevSpec;

  constructor(
    private route: ActivatedRoute,
    private xonomyService: XonomyService,
    private zahtevService: ZahtevService,
    private router: Router
  ) { }

  ngOnInit(): void {
    const id = this.route.snapshot.params.id;
    this.getOne(id);
  }

  getOne(id: string) {
    this.zahtevService.getOne(id).subscribe((zahtev) => this.document = zahtev);
  }

}
