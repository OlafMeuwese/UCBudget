import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";

const userAPIUrl: string = "http://localhost:8080/v1/user/";

@Injectable()
export class UserService {


  constructor(private httpClient: HttpClient) { }

  getUsers(){
    let command = "list";
    return this.httpClient.get(`${userAPIUrl}${command}`);
  }
}
