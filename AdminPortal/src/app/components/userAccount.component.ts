import {Component} from '@angular/core';
import {User} from '../models/user';
import { Router } from '@angular/router';
import {UserService} from '../services/user.service';


@Component({
  selector: 'user-account',
  templateUrl: './userAccount.component.html'
})
export class UserAccountComponent{
	userList: Object[];
	
	constructor(private userService: UserService, private router: Router) {
		this.getUsers();
	}

	getUsers() {
		this.userService.getUsers().subscribe(
			res => {
        		this.userList = JSON.parse(JSON.parse(JSON.stringify(res))._body);
      		},
      		error => console.log(error)
		)
	}

	onSelectPrimary(username: string) {
    	this.router.navigate(['/image-detail', this.selectedPhoto.photoId]);
  	}	


}