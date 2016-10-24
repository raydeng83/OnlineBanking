import { ModuleWithProviders }  from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { HomeComponent }  from './components/home.component';
import { LoginComponent } from './components/login.component';
import { UserAccountComponent } from './components/userAccount.component';
import { PrimaryTransactionComponent } from './components/primaryTransaction.component';
import { SavingsTransactionComponent } from './components/savingsTransaction.component';
import { AppointmentComponent } from './components/appointment.component';


const appRoutes: Routes = [
  {
    path: '',
    redirectTo: '/login',
    pathMatch: 'full'
  },
  {
    path: 'userAccount',
    component: UserAccountComponent
  },
  {
  	path: 'login',
  	component: LoginComponent
  },
  {
    path: 'primaryTransaction/:username',
    component: PrimaryTransactionComponent
  },
  {
    path: 'savingsTransaction/:username',
    component: SavingsTransactionComponent
  },
  {
    path: 'appointment',
    component: AppointmentComponent
  }
  
];

export const routing: ModuleWithProviders = RouterModule.forRoot(appRoutes);