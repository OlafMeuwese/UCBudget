import {Component, Input, OnInit} from '@angular/core';
import {User} from "./User";

@Component({
  selector: 'ucb-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {
  @Input("user")
  user: User;
  constructor() { }

  ngOnInit() {
  }

}
