import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ZalbaOdlukaViewComponent } from './zalba-odluka-view.component';

describe('ZalbaOdlukaViewComponent', () => {
  let component: ZalbaOdlukaViewComponent;
  let fixture: ComponentFixture<ZalbaOdlukaViewComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ZalbaOdlukaViewComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ZalbaOdlukaViewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
