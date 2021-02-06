import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ZalbaCutanjeXhtmlViewComponent } from './zalba-cutanje-xhtml-view.component';

describe('ZalbaCutanjeXhtmlViewComponent', () => {
  let component: ZalbaCutanjeXhtmlViewComponent;
  let fixture: ComponentFixture<ZalbaCutanjeXhtmlViewComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ZalbaCutanjeXhtmlViewComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ZalbaCutanjeXhtmlViewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
