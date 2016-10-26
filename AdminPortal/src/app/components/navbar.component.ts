import {Component} from '@angular/core';
import {LoginService} from '../services/login.service';
import { Router } from '@angular/router';

@Component({
	selector: 'navbar',
	templateUrl: './navbar.component.html',
	styleUrls: ['./navbar.component.css']
})
export class NavbarComponent {
	loggedIn: boolean;

	constructor(private loginService: LoginService, private router : Router) {
		if(localStorage.getItem('PortalAdminHasLoggedIn') == '') {
			this.loggedIn = false;
		} else {
			this.loggedIn = true;
		}
	}

	logout(){
		this.loginService.logout().subscribe(
			res => {
				localStorage.setItem('PortalAdminHasLoggedIn', '');	
			},
			err => console.log(err)
			);
		// location.reload();
		this.router.navigate(['/']);
	}

	getDisplay() {
    if(!this.loggedIn){
      return "none";
    } else {
      return "";
    }
  }
}
