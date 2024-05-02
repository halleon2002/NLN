import { Component } from '@angular/core';
import { PhieukhambenhService } from '../phieukhambenh.service';
import { Phieukhambenh } from '../phieukhambenh';

@Component({
  selector: 'app-phieukhambenh',
  templateUrl: './phieukhambenh.component.html',
  styleUrl: './phieukhambenh.component.css'
})
export class PhieukhambenhComponent {

  nphieukhambenh: Phieukhambenh[] = [];
  constructor(private phieuKhamBenhService: PhieukhambenhService) {

  }

  ngOnInit(): void {
    this.getnPhieuKhamBenh();
  }


  getnPhieuKhamBenh() {

    this.phieuKhamBenhService.getAllnPhieuKhanBenh().subscribe(data => {

      this.nphieukhambenh = data;

    })
  }

  delete(id: number) {
    this.phieuKhamBenhService.deletePhieuKhamBenh(id).subscribe(data => {
      console.log(data);
      this.getnPhieuKhamBenh();
    })
  }
}
