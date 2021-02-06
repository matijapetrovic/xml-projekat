import { Component, OnInit } from '@angular/core';
import { BehaviorSubject, Observable } from 'rxjs';
import { ZahtevService } from '../../zahtev.service';

@Component({
  selector: 'app-zahtev-metadata-search',
  templateUrl: './zahtev-metadata-search.component.html',
  styleUrls: ['./zahtev-metadata-search.component.scss']
})
export class ZahtevMetadataSearchComponent implements OnInit {

  nazivOrganaVlasti: string;
  podnesenU: string;
  podnesenDatuma: Date;
  imePodnosioca: string;
  prezimePodnosioca: string;

  searched: boolean = false;


  constructor(
    private zahtevService: ZahtevService
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
    this.zahtevService.searchMetadata(searchReq).subscribe();
    this.searched = true;
  }

  reset(): void {
    this.nazivOrganaVlasti = null;
    this.podnesenU = null;
    this.podnesenDatuma = null;
    this.imePodnosioca = null;
    this.prezimePodnosioca = null;
    if (this.searched)
      this.zahtevService.getAll().subscribe();
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
