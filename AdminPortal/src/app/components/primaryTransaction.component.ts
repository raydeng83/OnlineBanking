import {Component, Input} from '@angular/core';
import {User} from '../models/user';
import {UserService} from '../services/user.service';
import { ActivatedRoute, Params } from '@angular/router';


@Component({
  selector: 'primary-transaction',
  templateUrl: './primaryTransaction.component.html'
})
export class PrimaryTransactionComponent{
	username:string;
	primaryTransactionList: Object[];

	constructor(private route: ActivatedRoute, private userService: UserService) {
		this.route.params.forEach((params: Params) => {
     		this.username = params['username'];
		});

		this.getPrimaryTransactionList();
	}

	getPrimaryTransactionList() {
		this.userService.getPrimaryTransactionList(this.username).subscribe(
			res => {
				console.log(JSON.parse(JSON.stringify(res))._body);
        		this.primaryTransactionList = JSON.parse(JSON.parse(JSON.stringify(res))._body);
      		},
      		error => console.log(error)
		)
	}
}