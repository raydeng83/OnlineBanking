import {Component, Input} from '@angular/core';
import {User} from '../models/user';
import {UserService} from '../services/user.service';
import { ActivatedRoute, Params } from '@angular/router';


@Component({
  selector: 'savings-transaction',
  templateUrl: './savingsTransaction.component.html'
})
export class SavingsTransactionComponent{
	username:string;
	savingsTransactionList: Object[];

	constructor(private route: ActivatedRoute, private userService: UserService) {
		this.route.params.forEach((params: Params) => {
     		this.username = params['username'];
		});

		this.getSavingsTransactionList();
	}

	getSavingsTransactionList() {
		this.userService.getSavingsTransactionList(this.username).subscribe(
			res => {
				console.log(JSON.parse(JSON.stringify(res))._body);
        		this.savingsTransactionList = JSON.parse(JSON.parse(JSON.stringify(res))._body);
      		},
      		error => console.log(error)
		)
	}
}