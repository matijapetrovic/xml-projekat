import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ResenjaViewComponent } from './resenja-view.component';

describe('ResenjaViewComponent', () => {
  let component: ResenjaViewComponent;
  let fixture: ComponentFixture<ResenjaViewComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ResenjaViewComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ResenjaViewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
