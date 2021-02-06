import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ZalbeOdlukaViewComponent } from './zalbe-odluka-view.component';

describe('ZalbeOdlukaViewComponent', () => {
  let component: ZalbeOdlukaViewComponent;
  let fixture: ComponentFixture<ZalbeOdlukaViewComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ZalbeOdlukaViewComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ZalbeOdlukaViewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
