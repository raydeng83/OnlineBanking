import { ModuleWithProviders }  from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { HomeComponent }  from './components/home.component';
import { LoginComponent } from './components/login.component';
import { UserAccountComponent } from './components/userAccount.component';
import { PrimaryTransactionComponent } from './components/primaryTransaction.component';

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
  }
  
];

export const routing: ModuleWithProviders = RouterModule.forRoot(appRoutes);