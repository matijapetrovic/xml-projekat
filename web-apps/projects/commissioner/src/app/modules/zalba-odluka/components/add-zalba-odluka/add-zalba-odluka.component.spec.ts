import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddZalbaOdlukaComponent } from './add-zalba-odluka.component';

describe('AddZalbaOdlukaComponent', () => {
  let component: AddZalbaOdlukaComponent;
  let fixture: ComponentFixture<AddZalbaOdlukaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddZalbaOdlukaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AddZalbaOdlukaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
