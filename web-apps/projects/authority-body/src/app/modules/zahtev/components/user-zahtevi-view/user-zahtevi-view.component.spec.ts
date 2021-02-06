import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UserZahteviViewComponent } from './user-zahtevi-view.component';

describe('UserZahteviViewComponent', () => {
  let component: UserZahteviViewComponent;
  let fixture: ComponentFixture<UserZahteviViewComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UserZahteviViewComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(UserZahteviViewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
