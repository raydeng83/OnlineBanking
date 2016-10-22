import {Component} from '@angular/core';
import {Observable}  from 'rxjs/Observable';
import {LoginService} from '../services/login.service';
import {CookieService} from 'angular2-cookie/core';


@Component({
  selector: 'login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

	constructor (private loginService: LoginService, private cookieService: CookieService) {}

	username: string;
	password: string;
  
  onSubmit() {
  	this.loginService.sendCredential(this.username, this.password).subscribe();
  	console.log(this.getCookie('JSESSIONID'));
  }

  getCookie(key: string){
    return this.cookieService.get(key);
  }
}
