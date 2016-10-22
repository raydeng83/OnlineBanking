import {Component} from '@angular/core';
import {Observable}  from 'rxjs/Observable';
import {LoginService} from '../services/login.service';

@Component({
  selector: 'login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

	constructor (private loginService: LoginService) {}

	username: string;
	password: string;
  
  onSubmit() {
  	this.loginService.sendCredential(this.username, this.password).subscribe();
  }
}
