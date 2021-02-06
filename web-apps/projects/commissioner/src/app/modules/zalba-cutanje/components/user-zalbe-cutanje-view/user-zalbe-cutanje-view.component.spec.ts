import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UserZalbeCutanjeViewComponent } from './user-zalbe-cutanje-view.component';

describe('UserZalbeCutanjeViewComponent', () => {
  let component: UserZalbeCutanjeViewComponent;
  let fixture: ComponentFixture<UserZalbeCutanjeViewComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UserZalbeCutanjeViewComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(UserZalbeCutanjeViewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
