import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ZahtevPdfViewComponent } from './zahtev-pdf-view.component';

describe('ZahtevPdfViewComponent', () => {
  let component: ZahtevPdfViewComponent;
  let fixture: ComponentFixture<ZahtevPdfViewComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ZahtevPdfViewComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ZahtevPdfViewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
