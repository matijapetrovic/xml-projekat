import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { MessageService } from 'primeng/api';
import { ResenjeService } from '../../resenje.service';

@Component({
  selector: 'app-resenja-view',
  templateUrl: './resenja-view.component.html',
  styleUrls: ['./resenja-view.component.scss']
})
export class ResenjaViewComponent implements OnInit {
  resenja: Array<any>;
  
  constructor(
    private resenjeService: ResenjeService,
    public messageService: MessageService,
    private router: Router,
  ) { }

  ngOnInit(): void {
    this.getAll();
  }

  showResenje(id: string) {
    this.router.navigate([`/zahtevi/xhtml/${id}`]);
  }

  showXHTMLResenje(id: string) {
    this.getXhtml(id);
  }

  showPDFResenje(id: string) {
    this.getPDF(id);
  }

  getPDF(id: string) {
    this.resenjeService.getOnePDF(id).subscribe((zahtev) => {
      const file = this.makePdfBlob(zahtev);
      this.downloadPdf(file, id);
    });
  }

  getXhtml(id: string) {
    this.resenjeService.getOneXHTML(id).subscribe((zahtev) => {
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
    this.resenjeService.getAll().subscribe((resenja) => {
      this.resenja = resenja;
    });
  }
}
