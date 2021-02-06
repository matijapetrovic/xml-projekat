import { Component, OnInit } from '@angular/core';
import { ZahtevService } from '../../zahtev.service';
import { ConfirmationService } from 'primeng/api';
import { MessageService } from 'primeng/api';
import { Router } from '@angular/router';

@Component({
  selector: 'app-user-zahtevi-view',
  templateUrl: './user-zahtevi-view.component.html',
  styleUrls: ['./user-zahtevi-view.component.scss']
})
export class UserZahteviViewComponent implements OnInit {
  displayMessage: boolean;
  zahtevi: Array<any>;

  constructor(
    private zahtevService: ZahtevService,
    public confirmationService: ConfirmationService,
    public messageService: MessageService,
    private router: Router,
  ) { }

  ngOnInit(): void {
    this.getAll();
  }

  showNewInfo() {
    this.displayMessage = true;
  }

  showZahtev(id: number) {
    this.router.navigate([`/zahtevi/${id}`]);
  }

  showXHTMLZahtev(id: number) {
    this.router.navigate([`/zahtevi/xhtml/${id}`]);
  }

  showPDFZahtev(id: number) {
    this.getPDF(id);
  }

  getPDF(id: number) {
    this.zahtevService.getOnePDF(id).subscribe((zahtev) => {
      const file = this.makeBlob(zahtev);
      this.downloadPdf(file, id);
    });
  }

  makeBlob(zahtev: any) {
    let file = new Blob([zahtev], { type: 'application/pdf' });
    var fileURL = URL.createObjectURL(file);
    return fileURL
  }

  downloadPdf(file, fileName) {
    const source = file;
    const link = document.createElement("a");
    link.href = source;
    link.download = `${fileName}.pdf`
    link.click();
  }


  getAll() {
    this.zahtevService.getAll().subscribe((zahtevi) => {
      this.zahtevi = zahtevi.map((zahtev) => {
        zahtev['name'] = zahtev['za:TrazilacInformacija']['co:Ime']['_text'] + ' ' + zahtev['za:TrazilacInformacija']['co:Prezime']['_text'];
        let about: Array<string> = zahtev['_attributes']['about'].split('/');
        zahtev['id'] = about[about.length - 1];
        zahtev['expired'] = true;
        return zahtev;
      })
    });
  }

  newInfoMessage() {
    return 'The time to respond to this request has expired, you can complain to the commissioner!';
  }
}