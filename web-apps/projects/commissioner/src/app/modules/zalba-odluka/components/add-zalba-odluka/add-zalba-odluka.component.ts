import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { MessageService } from 'primeng/api';
import { XonomyService } from 'projects/xonomy/src/public-api';
import ZalbaOdlukaSpec from '../../zalba-odluka-xonomy-spec';
import { ZalbaOdlukaService } from '../../zalba-odluka.service';


@Component({
  selector: 'app-add-zalba-odluka',
  templateUrl: './add-zalba-odluka.component.html',
  styleUrls: ['./add-zalba-odluka.component.scss']
})
export class AddZalbaOdlukaComponent implements OnInit {
  document: string;
  spec: any = ZalbaOdlukaSpec;

  zahtevId: string;

  constructor(private xonomyService: XonomyService,
              private zalbaOdlukaService: ZalbaOdlukaService,
              private messageService: MessageService,
              route: ActivatedRoute) {
                route.params.subscribe((params) => this.zahtevId = params['zahtevId']);
               }

  ngOnInit(): void {
    this.zalbaOdlukaService.getExample().subscribe((document) => this.document = document);
  }

  addZalbaOdluka(): void {
    const document: string = this.xonomyService.getCurrentDocument();
    this.zalbaOdlukaService.add(this.zahtevId, document).subscribe(() => {
      this.messageService.add({severity: 'success', detail: 'Uspesno ste poslali zalbu'});
    })
  }

}
