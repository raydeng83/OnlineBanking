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

import { CookieService } from 'angular2-cookie/services/cookies.service';
import { LoginService } from './services/login.service';
import { UserService } from './services/user.service';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    LoginComponent,
    BannerComponent,
    NavbarComponent,
    UserAccountComponent,
    PrimaryTransactionComponent,
    SavingsTransactionComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    routing
  ],
  providers: [
    CookieService,
    LoginService,
    UserService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
