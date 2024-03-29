import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { MessageService } from 'primeng/api';
import { XonomyService } from 'projects/xonomy/src/public-api';
import zalbaCutanjeSpec from '../../zalba-cutanje-xonomy-spec';
import { ZalbaCutanjeService } from '../../zalba-cutanje.service';

@Component({
  selector: 'app-add-zalba-cutanje',
  templateUrl: './add-zalba-cutanje.component.html',
  styleUrls: ['./add-zalba-cutanje.component.scss']
})
export class AddZalbaCutanjeComponent implements OnInit {
  document: string;
  spec: any = zalbaCutanjeSpec;
  zahtevId: string;

  constructor(private xonomyService: XonomyService,
      private zalbaCutanjeService: ZalbaCutanjeService,
      private messageService: MessageService,
      route: ActivatedRoute) {
      route.params.subscribe((params) => this.zahtevId = params['zahtevId']);
    }

  ngOnInit(): void {
    this.zalbaCutanjeService.getExample().subscribe((document) => this.document = document);
  }

  addZalbaCutanje(): void {
    const document: string = this.xonomyService.getCurrentDocument();
    this.zalbaCutanjeService.add(this.zahtevId, document).subscribe(() => {
      this.messageService.add({severity: 'success', detail: 'Uspesno ste poslali zalbu'});
    })
  }
}
