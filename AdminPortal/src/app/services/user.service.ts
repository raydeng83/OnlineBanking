import {Injectable} from '@angular/core';
import {Http, Headers} from '@angular/http';
import {CookieService} from 'angular2-cookie/services/cookies.service';

@Injectable()
export class UserService {
	cookie:String

  constructor (private http:Http, private cookieService: CookieService){}

  getUsers() {
    let url = "http://localhost:8080/api/user/all";
    // let headers = new Headers(
    // {
    //   'Content-Type': 'application/x-www-form-urlencoded'
    //   // 'Access-Control-Allow-Credentials' : true
    // });
    return this.http.get(url, { withCredentials: true });
  }

  getCookie(key: string){
    return this.cookieService.get(key);
  }
}