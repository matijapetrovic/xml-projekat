import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ZalbaOdlukaXhtmlViewComponent } from './zalba-odluka-xhtml-view.component';

describe('ZalbaOdlukaXhtmlViewComponent', () => {
  let component: ZalbaOdlukaXhtmlViewComponent;
  let fixture: ComponentFixture<ZalbaOdlukaXhtmlViewComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ZalbaOdlukaXhtmlViewComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ZalbaOdlukaXhtmlViewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
