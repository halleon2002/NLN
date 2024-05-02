import { TestBed } from '@angular/core/testing';

import { PhieukhambenhService } from './phieukhambenh.service';

describe('PhieukhambenhService', () => {
  let service: PhieukhambenhService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(PhieukhambenhService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
