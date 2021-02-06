import { Component, OnInit } from '@angular/core';
import { ZahtevService } from '../../zahtev.service';
import { ConfirmationService } from 'primeng/api';
import { MessageService } from 'primeng/api';
import { Router } from '@angular/router';
import { environment } from 'projects/authority-body/src/environments/environment';

@Component({
  selector: 'app-user-zahtevi-view',
  templateUrl: './user-zahtevi-view.component.html',
  styleUrls: ['./user-zahtevi-view.component.scss']
})
export class UserZahteviViewComponent implements OnInit {
  displayMessage: boolean;
  zahtevi: Array<any>;

  zalbaCutanjeLink: string = `${environment.commissionerUrl}/zalba-cutanje/add/`;
  zalbaNaOdlukuLink: string = `${environment.commissionerUrl}/zalba-odluka/add/`;
  
  constructor(
    private zahtevService: ZahtevService,
    public confirmationService: ConfirmationService,
    public messageService: MessageService,
    private router: Router,
  ) { }

  ngOnInit(): void {
    this.getAll();
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
    this.zahtevService.getAll().subscribe((zahtevi) => {
      this.zahtevi = zahtevi.map((zahtev) => {
        console.log(zahtev);
        zahtev['name'] = zahtev['za:TrazilacInformacija']['co:Ime']['_text'] + ' ' + zahtev['za:TrazilacInformacija']['co:Prezime']['_text'];
        let about: Array<string> = zahtev['_attributes']['about'].split('/');
        zahtev['id'] = about[about.length - 1];
        let dateText = zahtev['za:OstaliPodaci']['co:Datum']['_text'];
        zahtev['expired'] = true;
        if (zahtev['_attributes']['prihvacen'])
          zahtev['prihvacen'] = zahtev['_attributes']['prihvacen'] === 'true';
        return zahtev;
      })
    });
  }

  responseTimeExpired(dateText: string): boolean {
    let currentDate = new Date();
    let date = new Date(dateText);
    date.setDate(date.getDate() + 7)
    return date > currentDate;
  }

  newInfoMessage(): string {
    return 'The time to respond to this request has expired, you can complain to the commissioner!';
  }
}
