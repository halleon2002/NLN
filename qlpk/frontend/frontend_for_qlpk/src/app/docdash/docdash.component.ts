import { Component } from '@angular/core';
import { Benhnhan } from '../benhnhan';
import { BenhnhanService } from '../benhnhan.service';
import { PhieukhambenhService } from '../phieukhambenh.service';
import { Phieukhambenh } from '../phieukhambenh';

@Component({
  selector: 'app-docdash',
  templateUrl: './docdash.component.html',
  styleUrl: './docdash.component.css'
})
export class DocdashComponent {


  constructor(private benhnhanService: BenhnhanService, private phieuKhamBenhService: PhieukhambenhService) { }
  nbenhnhan: Benhnhan[] = [];
  nphieukhambenh: Phieukhambenh[] = [];

  ngOnInit(): void {
    this.getnBenhnhan();
    this.getnPhieuKhamBenh();
  }


  getnBenhnhan() {
    this.benhnhanService.getBenhNhanList().subscribe(data => {
      this.nbenhnhan = data;
    })
  }


  getnPhieuKhamBenh() {

    this.phieuKhamBenhService.getAllnPhieuKhanBenh().subscribe(data => {

      this.nphieukhambenh = data;

    })
  }

}
