import {Component} from '@angular/core';
import {User} from '../models/user';

@Component({
  selector: 'transaction',
  templateUrl: './transaction.component.html'
})
export class TransactionComponent{
	transactionList: Object[];
	
	constructor() {
	}

}