import { Component, OnInit } from '@angular/core';
import { ConfirmationService } from 'primeng/api';
import { MessageService } from 'primeng/api';
import { Router } from '@angular/router';
import { ZalbaCutanjeService } from '../../zalba-cutanje.service';

@Component({
  selector: 'app-zalbe-cutanje-view',
  templateUrl: './zalbe-cutanje-view.component.html',
  styleUrls: ['./zalbe-cutanje-view.component.scss']
})
export class ZalbeCutanjeViewComponent implements OnInit {
  zalbe: Array<any>;

  constructor(
    private zalbaCutanjeService: ZalbaCutanjeService,
    public confirmationService: ConfirmationService,
    public messageService: MessageService,
    private router: Router,
  ) { 
    this.zalbaCutanjeService.zalbe.subscribe((zahtevi) => {
      this.zalbe = this.mapZalbe(zahtevi);
    });

  }

  ngOnInit(): void {
   this.getAll();
  }

  showAcceptForm(zahtev: any): void {
    this.router.navigate([`/obavestenja/add/${zahtev.id}`]);
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

  napisiResenje(zalba: any) {
    this.router.navigate([`/resenje/add/zalba-cutanje/${zalba.id}`]);
  }

  showZahtev(id: string) {
    this.router.navigate([`/zalba-cutanje/${id}`]);
  }

  showXHTMLZahtev(id: string) {
    this.getXhtml(id);
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
    this.zalbaCutanjeService.getAll().subscribe();
  }

  mapZalbe(zalbe: Array<any>) {
    console.log(zalbe);
    if (zalbe.length && zalbe[0] !== undefined) {
      return  zalbe.map((zalba) => {
        zalba['name'] = zalba['zlb:PodnosilacZalbe']['co:Ime']['_text'] + ' ' + zalba['zlb:PodnosilacZalbe']['co:Prezime']['_text'];
        let about: Array<string> = zalba['_attributes']['about'].split('/');
        zalba['id'] = about[about.length - 1];
        return zalba;
      })
    }
    return [];
  }
}
