import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminashComponent } from './adminash.component';

describe('AdminashComponent', () => {
  let component: AdminashComponent;
  let fixture: ComponentFixture<AdminashComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [AdminashComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(AdminashComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
