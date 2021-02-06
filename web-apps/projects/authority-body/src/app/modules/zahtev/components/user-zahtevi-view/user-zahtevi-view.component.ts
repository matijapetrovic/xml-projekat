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

  newInfoMessage() {
    return 'The time to respond to this request has expired, you can complain to the commissioner!';
  }
}
