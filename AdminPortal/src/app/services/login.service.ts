import {Injectable} from "@angular/core";
import {Http, Headers} from '@angular/http';
import {Observable}     from 'rxjs/Observable';

@Injectable()
export class LoginService {

  constructor (private http: Http) {}

  sendCredential(username: string, password: string) {
    let url = "http://localhost:8080/login";
    let params = 'username='+username+'&password='+password;
    let headers = new Headers({'Content-Type': 'application/json'});
    return this.http.post(url, params, {headers: headers});
  }

  // sendToken(token) {
  //   let tokenUrl2 = "http://localhost:8080/rest/user/users";
  //   console.log('Bearer '+token);

  //   let getHeaders = new Headers({'Authorization':'Bearer '+token});

  //   return this.http.get(tokenUrl2, {headers: getHeaders})
  // }

  // logout() {
  //   localStorage.setItem("token","");
  //   localStorage.setItem("currentUserName", '');
  //   alert("You just logged out.");
  // }

  // checkLogin() {
  //   if (localStorage.getItem("currentUserName")!='' && localStorage.getItem("token")!='') {
  //     return true;
  //   } else {
  //     return false;
  //   }
  // }

}
