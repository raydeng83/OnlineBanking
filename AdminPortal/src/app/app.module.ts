import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { routing }  from './app.routing';

import { AppComponent } from './app.component';
import { HomeComponent } from './components/home.component';
import { LoginComponent } from './components/login.component';
import { BannerComponent } from './components/banner.component';
import { NavbarComponent } from './components/navbar.component';
import { UserAccountComponent } from './components/userAccount.component';
import { PrimaryTransactionComponent } from './components/primaryTransaction.component';
import { SavingsTransactionComponent } from './components/savingsTransaction.component';
import { AppointmentComponent } from './components/appointment.component';

import { CookieService } from 'angular2-cookie/services/cookies.service';
import { LoginService } from './services/login.service';
import { UserService } from './services/user.service';
import { AppointmentService } from './services/appointment.service';

import {DataTableModule} from "angular2-datatable";

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    LoginComponent,
    BannerComponent,
    NavbarComponent,
    UserAccountComponent,
    PrimaryTransactionComponent,
    SavingsTransactionComponent,
    AppointmentComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    routing,
    DataTableModule
  ],
  providers: [
    CookieService,
    LoginService,
    UserService,
    AppointmentService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
