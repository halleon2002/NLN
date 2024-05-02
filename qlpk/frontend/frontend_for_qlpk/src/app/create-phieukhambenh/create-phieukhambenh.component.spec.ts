import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreatePhieukhambenhComponent } from './create-phieukhambenh.component';

describe('CreatePhieukhambenhComponent', () => {
  let component: CreatePhieukhambenhComponent;
  let fixture: ComponentFixture<CreatePhieukhambenhComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [CreatePhieukhambenhComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(CreatePhieukhambenhComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
