import { Component } from '@angular/core';
import { BenhnhanService } from '../benhnhan.service';
import { Benhnhan } from '../benhnhan';
import { Router } from '@angular/router';

@Component({
  selector: 'app-adminash',
  templateUrl: './adminash.component.html',
  styleUrl: './adminash.component.css'
})
export class AdminashComponent {


  nbenhnhan: Benhnhan[] = [];
  constructor(private benhnhanService: BenhnhanService, private router: Router) { }


  ngOnInit(): void {
    this.getnBenhnhan();
  }


  getnBenhnhan() {
    this.benhnhanService.getBenhNhanList().subscribe(data => {
      this.nbenhnhan = data;
    })
  }

  delete(id: number) {
    this.benhnhanService.delete(id).subscribe(data => {
      console.log(data);
      this.getnBenhnhan();
    })
  }


}
