import { Component, OnInit } from '@angular/core';
import { ZahtevService } from '../../zahtev.service';
import { ConfirmationService } from 'primeng/api';
import { MessageService } from 'primeng/api';
import { Router } from '@angular/router';

@Component({
  selector: 'app-zahtevi-view',
  templateUrl: './zahtevi-view.component.html',
  styleUrls: ['./zahtevi-view.component.scss']
})
export class ZahteviViewComponent implements OnInit {
  zahtevi: Array<any>;
  displayMessage: boolean = false;

  odbijenZahtevId: string;

  odbijenZahtevRazlog: string;
  
  constructor(
    private zahtevService: ZahtevService,
    public confirmationService: ConfirmationService,
    public messageService: MessageService,
    private router: Router
  ) {
    this.zahtevService.getAll().subscribe((zahtevi) =>  {
      this.zahtevi = this.mapZahtevi(zahtevi);
    });
   }

  ngOnInit(): void {
   this.getAll();
  }

  showAcceptForm(zahtev: any): void {
    this.router.navigate([`/obavestenje/add/${zahtev['id']}`]);
  }

  showRejectDialog(id: string): void {
    this.displayMessage = true;
    this.odbijenZahtevId = id;
  }

  odbijZahtev() {
    this.zahtevService.rejectZahtev(this.odbijenZahtevId, this.odbijenZahtevRazlog)
      .subscribe(() => {this.displayMessage = false; this.odbijenZahtevId = null; this.odbijenZahtevRazlog = ''; this.getAll(); });
  }

  showZahtev(id: string) {
    this.router.navigate([`/zahtevi/xhtml/${id}`]);
  }

  showXHTMLZahtev(id: string) {
    this.getXhtml(id);
  }

  showPDFZahtev(id: string) {
    this.getPDF(id);
  }

  getPDF(id: string) {
    this.zahtevService.getOnePDF(id).subscribe((zahtev) => {
      const file = this.makePdfBlob(zahtev);
      this.downloadPdf(file, id);
    });
  }

  getXhtml(id: string) {
    this.zahtevService.getOneXHTML(id).subscribe((zahtev) => {
      const file = this.makeXHTMLBlob(zahtev);
      this.downloadXHTML(file, id);
    })
  }

  makePdfBlob(zahtev: any) {
    let file = new Blob([zahtev], { type: 'application/pdf' });
    var fileURL = URL.createObjectURL(file);
    return fileURL;
  }

  makeXHTMLBlob(zahtev: any) {
    let file = new Blob([zahtev], { type: 'application/xhtml+xml' });
    var fileURL = URL.createObjectURL(file);
    return fileURL;
  }

  downloadPdf(file, fileName) {
    const source = file;
    const link = document.createElement("a");
    link.href = source;
    link.download = `${fileName}.pdf`;
    link.click();
  }

  downloadXHTML(file, fileName) {
    const source = file;
    const link = document.createElement("a");
    link.href = source;
    link.download = `${fileName}.xhtml`;
    link.click();
  }

  getAll() {
    this.zahtevService.getAll().subscribe();
  }

  mapZahtevi(zahtevi: Array<any>): Array<any> {
    return zahtevi.map((zahtev) => { 
      zahtev['name'] = zahtev['za:TrazilacInformacija']['co:Ime']['_text'] + ' ' + zahtev['za:TrazilacInformacija']['co:Prezime']['_text'];
      let about: Array<string> = zahtev['_attributes']['about'].split('/');
      zahtev['id'] = about[about.length - 1];
      if (zahtev['_attributes']['prihvacen'])
        zahtev['prihvacen'] = zahtev['_attributes']['prihvacen'] === 'true';
      return zahtev;
    });
  }
}
