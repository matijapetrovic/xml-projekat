import { ComponentFixture, TestBed } from '@angular/core/testing';

import { XonomyComponent } from './xonomy.component';

describe('XonomyComponent', () => {
  let component: XonomyComponent;
  let fixture: ComponentFixture<XonomyComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ XonomyComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(XonomyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
