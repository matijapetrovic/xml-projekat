import { Component, OnInit } from '@angular/core';
import { XonomyService } from 'projects/xonomy/src/public-api';
import zahtevSpec from '../../zahtev-xonomy-spec';
import { ZahtevService } from '../../zahtev.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add-zahtev',
  templateUrl: './add-zahtev.component.html',
  styleUrls: ['./add-zahtev.component.scss']
})
export class AddZahtevComponent implements OnInit {
  document: string;
  spec: any = zahtevSpec;

  constructor(
      private xonomyService: XonomyService,
      private zahtevService: ZahtevService,
      private router: Router) { }

  ngOnInit(): void {
    this.zahtevService.getExample().subscribe((document) => this.document = document);
  }

  addZahtev(): void {
    const document: string = this.xonomyService.getCurrentDocument();
    this.zahtevService.add(document).subscribe(() => {
      console.log('dodat zahtev');
      this.router.navigate(['/obavestenja/add']);
    })
  }

}
