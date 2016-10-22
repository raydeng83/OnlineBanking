import {Injectable} from '@angular/core';
import {Http, Headers} from '@angular/http';
import {CookieService} from 'angular2-cookie/core';

@Injectable()
export class UserService {
	cookie:String

  constructor (private http:Http, private cookieService: CookieService){}

  getUsers() {
    let url = "http://localhost:8080/api/user/all";
    return this.http.get(url);
  }

  getCookie(key: string){
    return this.cookieService.get(key);
  }
}