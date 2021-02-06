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
  

  constructor(
    private zahtevService: ZahtevService,
    public confirmationService: ConfirmationService,
    public messageService: MessageService,
    private router: Router,
  ) { }

  ngOnInit(): void {
   this.getAll();
  }

  showAcceptForm(zahtev: any): void {
    this.router.navigate([`/obavestenje/add/${zahtev['id']}`]);
  }

  showRejectDialog(id: string): void {
    this.confirmationService.confirm({
      message: 'Do you want to reject this request?',
      header: 'Delete Confirmation',
      icon: 'pi pi-info-circle',
      accept: () => {
        this.messageService.add({ severity: 'info', summary: 'Confirmed', detail: 'You have successfuly rejected request!' });
      },
      reject: () => {
      }
    });
  }

  showZahtev(id: string) {
    this.router.navigate([`/zahtevi/${id}`]);
  }

  showXHTMLZahtev(id: string) {
    this.router.navigate([`/zahtevi/xhtml/${id}`]);
  }

  showPDFZahtev(id: string) {
    this.getPDF(id);
  }

  getPDF(id: string) {
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
      if (zahtevi.length && zahtevi[0] !== undefined) {
        this.zahtevi = zahtevi.map((zahtev) => {
          zahtev['name'] = zahtev['za:TrazilacInformacija']['co:Ime']['_text'] + ' ' + zahtev['za:TrazilacInformacija']['co:Prezime']['_text'];
          let about: Array<string> = zahtev['_attributes']['about'].split('/');
          zahtev['id'] = about[about.length - 1];
          return zahtev;
        })
      }
    });
  }
}
