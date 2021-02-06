import { Component, OnInit } from '@angular/core';
import { ConfirmationService } from 'primeng/api';
import { MessageService } from 'primeng/api';
import { Router } from '@angular/router';
import { ZalbaCutanjeService } from '../../zalba-cutanje.service';

@Component({
  selector: 'app-user-zalbe-cutanje-view',
  templateUrl: './user-zalbe-cutanje-view.component.html',
  styleUrls: ['./user-zalbe-cutanje-view.component.scss']
})
export class UserZalbeCutanjeViewComponent implements OnInit {
  zalbe: Array<any>;

  constructor(
    private zalbaCutanjeService: ZalbaCutanjeService,
    public confirmationService: ConfirmationService,
    public messageService: MessageService,
    private router: Router,
  ) { }

  ngOnInit(): void {
    this.getAll();
  }

  showAcceptForm(zahtev: any): void {
    this.router.navigate(['/obavestenja/add']);
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
    this.router.navigate([`/zalba-cutanje/${id}`]);
  }

  showXHTMLZahtev(id: string) {
    this.router.navigate([`/zalba-cutanje/xhtml/${id}`]);
  }

  showPDFZahtev(id: string) {
    this.getPDF(id);
  }

  getPDF(id: string) {
    this.zalbaCutanjeService.getOnePDF(id).subscribe((zahtev) => {
      const file = this.makePdfBlob(zahtev);
      this.downloadPdf(file, id);
    });
  }

  getXhtml(id: string) {
    this.zalbaCutanjeService.getOneXHTML(id).subscribe((zahtev) => {
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
    this.zalbaCutanjeService.getAll().subscribe((zalbe) => {
      if (zalbe.length && zalbe[0] !== undefined) {
        this.zalbe = zalbe.map((zalba) => {
          zalba['name'] = zalba['zlb:PodnosilacZalbe']['co:Ime']['_text'] + ' ' + zalba['zlb:PodnosilacZalbe']['co:Prezime']['_text'];
          let about: Array<string> = zalba['_attributes']['about'].split('/');
          zalba['id'] = about[about.length - 1];
          return zalba;
        })
      }
    });
  }
}
