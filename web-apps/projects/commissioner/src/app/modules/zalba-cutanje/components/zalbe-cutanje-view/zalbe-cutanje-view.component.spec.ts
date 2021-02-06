import { ComponentFixture, TestBed } from '@angular/core/testing';
import { ZalbeCutanjeViewComponent } from './zalbe-cutanje-view.component';


describe('ZahteviViewComponent', () => {
  let component: ZalbeCutanjeViewComponent;
  let fixture: ComponentFixture<ZalbeCutanjeViewComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ZalbeCutanjeViewComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ZalbeCutanjeViewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
