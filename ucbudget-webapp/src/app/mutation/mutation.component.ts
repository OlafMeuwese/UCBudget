import {Component, Input, OnInit} from '@angular/core';
import {Mutation} from "./mutation";

@Component({
  selector: 'ucb-mutation',
  templateUrl: './mutation.component.html',
  styleUrls: ['./mutation.component.css']
})
export class MutationComponent implements OnInit {
  @Input("mutation") mutation:Mutation;

  constructor() { }

  ngOnInit() {
  }

}
