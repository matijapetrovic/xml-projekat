import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ObavestenjaViewComponent } from './obavestenja-view.component';

describe('ObavestenjaViewComponent', () => {
  let component: ObavestenjaViewComponent;
  let fixture: ComponentFixture<ObavestenjaViewComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ObavestenjaViewComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ObavestenjaViewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
