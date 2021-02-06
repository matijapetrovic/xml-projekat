import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UserZalbeOdlukaViewComponent } from './user-zalbe-odluka-view.component';

describe('UserZalbeOdlukaViewComponent', () => {
  let component: UserZalbeOdlukaViewComponent;
  let fixture: ComponentFixture<UserZalbeOdlukaViewComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UserZalbeOdlukaViewComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(UserZalbeOdlukaViewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
