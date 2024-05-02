import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PhieukhambenhComponent } from './phieukhambenh.component';

describe('PhieukhambenhComponent', () => {
  let component: PhieukhambenhComponent;
  let fixture: ComponentFixture<PhieukhambenhComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [PhieukhambenhComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(PhieukhambenhComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
