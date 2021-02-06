import { Component, OnInit } from '@angular/core';
import { XonomyService } from 'projects/xonomy/src/public-api';
import { Router, ActivatedRoute } from '@angular/router';
import { ZalbaOdlukaService } from '../../zalba-odluka.service';
import zahtevSpec  from '../../zalba-odluka-xonomy-spec';

@Component({
  selector: 'app-zalba-odluka-view',
  templateUrl: './zalba-odluka-view.component.html',
  styleUrls: ['./zalba-odluka-view.component.scss']
})
export class ZalbaOdlukaViewComponent implements OnInit {

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
    this.zalbaOdlukaService.getOne(id).subscribe((zahtev) => this.document = zahtev);
  }
}
