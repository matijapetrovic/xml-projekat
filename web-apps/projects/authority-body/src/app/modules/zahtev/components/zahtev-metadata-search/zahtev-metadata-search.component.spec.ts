import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ZahtevMetadataSearchComponent } from './zahtev-metadata-search.component';

describe('ZahtevMetadataSearchComponent', () => {
  let component: ZahtevMetadataSearchComponent;
  let fixture: ComponentFixture<ZahtevMetadataSearchComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ZahtevMetadataSearchComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ZahtevMetadataSearchComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
