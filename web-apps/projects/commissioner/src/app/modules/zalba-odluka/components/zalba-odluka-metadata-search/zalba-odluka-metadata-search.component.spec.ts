import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ZalbaOdlukaMetadataSearchComponent } from './zalba-odluka-metadata-search.component';

describe('ZalbaOdlukaMetadataSearchComponent', () => {
  let component: ZalbaOdlukaMetadataSearchComponent;
  let fixture: ComponentFixture<ZalbaOdlukaMetadataSearchComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ZalbaOdlukaMetadataSearchComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ZalbaOdlukaMetadataSearchComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
