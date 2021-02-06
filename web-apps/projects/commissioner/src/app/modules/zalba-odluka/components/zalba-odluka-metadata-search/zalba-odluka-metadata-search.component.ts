import { Component, OnInit } from '@angular/core';
import { ZalbaOdlukaService } from '../../zalba-odluka.service';

@Component({
  selector: 'app-zalba-odluka-metadata-search',
  templateUrl: './zalba-odluka-metadata-search.component.html',
  styleUrls: ['./zalba-odluka-metadata-search.component.scss']
})
export class ZalbaOdlukaMetadataSearchComponent implements OnInit {
  nazivOrganaVlasti: string;
  podnesenU: string;
  podnesenDatuma: Date;
  imePodnosioca: string;
  prezimePodnosioca: string;

  searched: boolean = false;

  constructor(
    private zalbaOdlukaService: ZalbaOdlukaService
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
    this.zalbaOdlukaService.searchMetadata(searchReq).subscribe();
    this.searched = true;
  }

  reset(): void {
    this.nazivOrganaVlasti = null;
    this.podnesenU = null;
    this.podnesenDatuma = null;
    this.imePodnosioca = null;
    this.prezimePodnosioca = null;
    if (this.searched)
      this.zalbaOdlukaService.getAll().subscribe();
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
