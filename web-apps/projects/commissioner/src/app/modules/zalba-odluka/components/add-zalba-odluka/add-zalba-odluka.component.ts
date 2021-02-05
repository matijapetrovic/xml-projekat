import { Component, OnInit } from '@angular/core';
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

  constructor(private xonomyService: XonomyService,
              private zalbaOdlukaService: ZalbaOdlukaService) { }

  ngOnInit(): void {
    this.zalbaOdlukaService.getExample().subscribe((document) => this.document = document);
  }

  addZalbaOdluka(): void {
    const document: string = this.xonomyService.getCurrentDocument();
    this.zalbaOdlukaService.add(document).subscribe(() => {
      console.log('ide gas dodato max');
    })
  }

}
