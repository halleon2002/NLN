import { NgModule } from '@angular/core';
import { BrowserModule, provideClientHydration } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AdminashComponent } from './adminash/adminash.component';
import { HttpClientModule } from '@angular/common/http';
import { PhieukhambenhComponent } from './phieukhambenh/phieukhambenh.component';
import { CreatePhieukhambenhComponent } from './create-phieukhambenh/create-phieukhambenh.component';
import { FormsModule } from '@angular/forms';
import { TrangchuComponent } from './trangchu/trangchu.component';
import { DocdashComponent } from './docdash/docdash.component';

@NgModule({
  declarations: [
    AppComponent,
    AdminashComponent,
    PhieukhambenhComponent,
    CreatePhieukhambenhComponent,
    TrangchuComponent,
    DocdashComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [
    provideClientHydration()
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
