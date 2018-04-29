import {Component, OnInit} from '@angular/core';
import {UserService} from "./user.service";
import {User} from "./User";

@Component({
  selector: 'ucb-user-list',
  templateUrl: './user-list.component.html',
  styleUrls: ['./user-list.component.css']
})
export class UserListComponent implements OnInit {
  users: User[] = [];
  constructor(private userService: UserService) { }

  ngOnInit() {
    this.userService.getUsers()
      .subscribe((response: User[]) => {
        response.forEach( user =>
          this.users.push(new User().deserialize(user))
        )
      },
        error => console.error("There has been an error: "+error),
        ()=> {
        console.log("Done with Users");
        console.log(this.users);
        }
      );
  }

}
