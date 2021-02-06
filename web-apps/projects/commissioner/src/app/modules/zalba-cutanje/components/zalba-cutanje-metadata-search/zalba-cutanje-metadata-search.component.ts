import { Component, OnInit } from '@angular/core';
import { ZalbaCutanjeService } from '../../zalba-cutanje.service'


@Component({
  selector: 'app-zalba-cutanje-metadata-search',
  templateUrl: './zalba-cutanje-metadata-search.component.html',
  styleUrls: ['./zalba-cutanje-metadata-search.component.scss']
})
export class ZalbaCutanjeMetadataSearchComponent implements OnInit {

  nazivOrganaVlasti: string;
  podnesenU: string;
  podnesenDatuma: Date;
  imePodnosioca: string;
  prezimePodnosioca: string;

  searched: boolean = false;

  constructor(
    private zalbaCutanjeService: ZalbaCutanjeService
  ) { }

  ngOnInit(): void {
  }


  submit(): void {
    let searchReq = {
      nazivOrganaVlasti: this.nazivOrganaVlasti,
      podnesenU: this.podnesenU,
      podnesenDatuma: this.podnesenDatuma,
      imePodnosioca: this.imePodnosioca,
      prezimePodnosioca: this.prezimePodnosioca
    };
    this.zalbaCutanjeService.searchMetadata(searchReq).subscribe();
    this.searched = true;
  }

  reset(): void {
    this.nazivOrganaVlasti = null;
    this.podnesenU = null;
    this.podnesenDatuma = null;
    this.imePodnosioca = null;
    this.prezimePodnosioca = null;
    if (this.searched)
      this.zalbaCutanjeService.getAll().subscribe();
    this.searched = false;
  }

  submitDisabled(): boolean {
    return !this.nazivOrganaVlasti &&
      !this.podnesenDatuma &&
      !this.imePodnosioca &&
      !this.prezimePodnosioca &&
      !this.podnesenU;
  }
}
