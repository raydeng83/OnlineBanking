import {Injectable} from '@angular/core';
import {Http, Headers} from '@angular/http';

@Injectable()
export class UserService {

  constructor (private http:Http){}

  getUsers() {
    let url = "http://localhost:8080/api/user/all";
    return this.http.get(url, { withCredentials: true });
  }

   getPrimaryTransactionList(username: string) {
     let url = "http://localhost:8080/api/user/primary/transaction?username="+username;
    return this.http.get(url, { withCredentials: true });
   }

   getSavingsTransactionList(username: string) {
     let url = "http://localhost:8080/api/user/savings/transaction?username="+username;
    return this.http.get(url, { withCredentials: true });
   }
}