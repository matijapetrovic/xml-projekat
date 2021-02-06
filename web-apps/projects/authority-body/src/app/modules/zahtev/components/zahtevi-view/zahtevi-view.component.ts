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
    this.router.navigate(['/obavestenja/add']);
  }

  showRejectDialog(id: number): void {
    this.confirmationService.confirm({
      message: 'Do you want to reject this request?',
      header: 'Delete Confirmation',
      icon: 'pi pi-info-circle',
      accept: () => {
        this.zahtevService.deleteZahtev(id)
          .subscribe(
            () => {
              this.messageService.add({ severity: 'info', summary: 'Confirmed', detail: 'You have successfuly rejected request!' });
              this.getAll();
            });
      },
      reject: () => {
      }
    });
  }

  showZahtev(id: number) {
    this.router.navigate([`/zahtevi/${id}`]);
  }

  showXHTMLZahtev(id: number) {
    this.router.navigate([`/zahtevi/xhtml/${id}`]);
  }

  showPDFZahtev(id: number) {
    this.router.navigate([`/zahtevi/pdf/${id}`]);
  }

  getAll() {
    this.zahtevService.getAll().subscribe((zahtevi) => { 
      this.zahtevi = zahtevi.map((zahtev) => { 
        zahtev['name'] = zahtev['za:TrazilacInformacija']['co:Ime']['_text'] + ' ' + zahtev['za:TrazilacInformacija']['co:Prezime']['_text'];
        let about: Array<string> = zahtev['_attributes']['about'].split('/');
        zahtev['id'] = about[about.length - 1];
        return zahtev;
      })
    });
  }
}
