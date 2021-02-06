import { Component, OnInit } from '@angular/core';
import { ConfirmationService } from 'primeng/api';
import { MessageService } from 'primeng/api';
import { Router } from '@angular/router';
import { ZalbaOdlukaService } from '../../zalba-odluka.service';

@Component({
  selector: 'app-zalbe-odluka-view',
  templateUrl: './zalbe-odluka-view.component.html',
  styleUrls: ['./zalbe-odluka-view.component.scss']
})
export class ZalbeOdlukaViewComponent implements OnInit {
  zalbe: Array<any>;

  constructor(
    private zalbaOdlukaService: ZalbaOdlukaService,
    public confirmationService: ConfirmationService,
    public messageService: MessageService,
    private router: Router,
  ) { }

  ngOnInit(): void {
    this.getAll();
  }

  napisiResenje(zalba: any) {
    this.router.navigate[`/resenje/add/zalba-odluka/${zalba.id}`];
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
    this.router.navigate([`/zalba-odluka/${id}`]);
  }

  showXHTMLZahtev(id: string) {
    this.getXhtml(id);
  }

  showPDFZahtev(id: string) {
    this.getPDF(id);
  }

  getPDF(id: string) {
    this.zalbaOdlukaService.getOnePDF(id).subscribe((zahtev) => {
      const file = this.makePdfBlob(zahtev);
      this.downloadPdf(file, id);
    });
  }

  getXhtml(id: string) {
    this.zalbaOdlukaService.getOneXHTML(id).subscribe((zahtev) => {
      const file = this.makeXHTMLBlob(zahtev);
      this.downloadXHTML(file, id);
    })
  }

  makeXHTMLBlob(zahtev: any) {
    let file = new Blob([zahtev], { type: 'application/xhtml+xml' });
    var fileURL = URL.createObjectURL(file);
    return fileURL;
  }

  makePdfBlob(zahtev: any) {
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

  downloadXHTML(file, fileName) {
    const source = file;
    const link = document.createElement("a");
    link.href = source;
    link.download = `${fileName}.xhtml`;
    link.click();
  }
  getAll() {
    this.zalbaOdlukaService.getAll().subscribe((zalbe) => {
      if (zalbe.length && zalbe[0] !== undefined) {
        this.zalbe = zalbe.map((zalba) => {
          zalba['name'] = zalba['zod:PodnosilacZalbe']['co:Ime']['_text'] + ' ' + zalba['zod:PodnosilacZalbe']['co:Prezime']['_text'];
          let about: Array<string> = zalba['_attributes']['about'].split('/');
          zalba['id'] = about[about.length - 1];
          return zalba;
        })
      }
    });
  }
}
