import {Component} from '@angular/core';
import {Observable}  from 'rxjs/Observable';
import {LoginService} from '../services/login.service';
import { Router } from '@angular/router';


@Component({
  selector: 'login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

  loggedIn: boolean;
  username: string;
  password: string;

	constructor (private loginService: LoginService, private router: Router) {
    if(localStorage.getItem('PortalAdminHasLoggedIn') == '') {
      this.loggedIn = false;
    } else {
      this.loggedIn = true;
    }
  }
  
  onSubmit() {
  	this.loginService.sendCredential(this.username, this.password).subscribe(
      res => {
        this.loggedIn=true;
        localStorage.setItem('PortalAdminHasLoggedIn', 'true');
        this.router.navigate(['/']);
      },
      err => console.log(err)
    );
  }
}
