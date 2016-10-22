import {Component} from '@angular/core';
import {UserService} from '../services/user.service';

@Component({
  selector: 'home',
  templateUrl: './home.component.html'
})
export class HomeComponent{
	constructor(private userService: UserService) {}

	getUsers() {
		this.userService.getUsers().subscribe(
			res => {
        		console.log(JSON.parse(JSON.stringify(res))._body);
      		},
      		error => console.log(error)
		)
	}	

}