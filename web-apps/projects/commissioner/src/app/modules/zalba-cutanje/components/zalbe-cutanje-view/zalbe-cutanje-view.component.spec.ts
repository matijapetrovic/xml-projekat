import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ZahteviViewComponent } from './zahtevi-view.component';

describe('ZahteviViewComponent', () => {
  let component: ZahteviViewComponent;
  let fixture: ComponentFixture<ZahteviViewComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ZahteviViewComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ZahteviViewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
