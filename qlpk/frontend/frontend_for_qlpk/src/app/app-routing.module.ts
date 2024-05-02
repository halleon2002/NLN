import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminashComponent } from './adminash/adminash.component';
import { PhieukhambenhComponent } from './phieukhambenh/phieukhambenh.component';
import { CreatePhieukhambenhComponent } from './create-phieukhambenh/create-phieukhambenh.component';
import { TrangchuComponent } from './trangchu/trangchu.component';
import { DocdashComponent } from './docdash/docdash.component';

const routes: Routes = [
  { path: 'admin', component: AdminashComponent },
  { path: 'phieukhambenhlist', component: PhieukhambenhComponent },
  { path: 'create-phieukhambenh', component: CreatePhieukhambenhComponent },
  { path: 'trangchu', component: TrangchuComponent },
  { path: '', redirectTo: 'trangchu', pathMatch: 'full' },
  { path: 'docdash', component: DocdashComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
