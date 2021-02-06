import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ZalbaCutanjeMetadataSearchComponent } from './zalba-cutanje-metadata-search.component';

describe('ZalbaCutanjeMetadataSearchComponent', () => {
  let component: ZalbaCutanjeMetadataSearchComponent;
  let fixture: ComponentFixture<ZalbaCutanjeMetadataSearchComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ZalbaCutanjeMetadataSearchComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ZalbaCutanjeMetadataSearchComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
