import { Component } from '@angular/core';
import { Phieukhambenh } from '../phieukhambenh';
import { PhieukhambenhService } from '../phieukhambenh.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-create-phieukhambenh',
  templateUrl: './create-phieukhambenh.component.html',
  styleUrl: './create-phieukhambenh.component.css'
})
export class CreatePhieukhambenhComponent {

  phieukhambenh: Phieukhambenh = new Phieukhambenh();

  constructor(private phieukhambenhService: PhieukhambenhService, private router: Router) { }

  savePhieuKhamBenh() {
    this.phieukhambenhService.createPhieuKhamBenh(this.phieukhambenh).subscribe(data => {
      console.log(data);
      this.goToPhieukhambenh();


    })
  }


  onSubmit() {
    this.savePhieuKhamBenh();
  }

  goToPhieukhambenh() {
    this.router.navigate(['/phieukhambenhlist'])
  }
}
