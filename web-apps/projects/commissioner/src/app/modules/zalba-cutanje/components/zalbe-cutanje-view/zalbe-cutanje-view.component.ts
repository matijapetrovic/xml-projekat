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
  ) { }

  ngOnInit(): void {
   this.getAll();
  }

  showAcceptForm(zahtev: any): void {
    this.router.navigate(['/obavestenja/add']);
  }

  showZahtev(id: number) {
    this.router.navigate([`/zalba-cutanje/${id}`]);
  }

  showXHTMLZahtev(id: number) {
    this.router.navigate([`/zahtevi/xhtml/${id}`]);
  }

  showPDFZahtev(id: number) {
    this.getPDF(id);
  }

  getPDF(id: number) {
    this.zalbaCutanjeService.getOnePDF(id).subscribe((zahtev) => {
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
    this.zalbaCutanjeService.getAll().subscribe((zalbe) => { 
      this.zalbe = zalbe.map((zalba) => { 
        zalba['name'] = zalba['za:TrazilacInformacija']['co:Ime']['_text'] + ' ' + zalba['za:TrazilacInformacija']['co:Prezime']['_text'];
        let about: Array<string> = zalba['_attributes']['about'].split('/');
        zalba['id'] = about[about.length - 1];
        return zalba;
      })
    });
  }
}
