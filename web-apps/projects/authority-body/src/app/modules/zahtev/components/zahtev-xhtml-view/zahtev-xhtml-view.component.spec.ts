import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ZahtevXhtmlViewComponent } from './zahtev-xhtml-view.component';

describe('ZahtevXhtmlViewComponent', () => {
  let component: ZahtevXhtmlViewComponent;
  let fixture: ComponentFixture<ZahtevXhtmlViewComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ZahtevXhtmlViewComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ZahtevXhtmlViewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
