import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ZalbaCutanjeViewComponent } from './zalba-cutanje-view.component';

describe('ZalbaCutanjeViewComponent', () => {
  let component: ZalbaCutanjeViewComponent;
  let fixture: ComponentFixture<ZalbaCutanjeViewComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ZalbaCutanjeViewComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ZalbaCutanjeViewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
