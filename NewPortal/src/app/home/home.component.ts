import { Component, OnInit } from '@angular/core';
import {UserService} from '../user.service';


@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor(private userService: UserService) {}

	getUsers() {
		this.userService.getUsers().subscribe(
			res => {
        		console.log(JSON.parse(JSON.stringify(res))._body);
      		},
      		error => console.log(error)
		)
	}	

ngOnInit() {}
}
