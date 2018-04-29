import {Component, OnInit} from "@angular/core";
import {MutationService} from "./mutation.service";
import 'rxjs/add/operator/toPromise';
import {Mutation} from "./mutation";
import {MutationType} from "./mutation-type";

@Component({
  selector: "ucb-mutation-list",
  templateUrl: "mutation-list.component.html"
})
export class MutationListComponent implements OnInit {

  public mutations: Mutation[] = [new Mutation().deserialize({
    id: 4,
    bankAccount: 5,
    type: MutationType.credit,
    amount: 34.5,
    recordDate: new Date("2017-4-12"),
    description: "Vijfde Betaling",
    accountName: "Gerrit",
    accountNumber: "NL1"
  })];
  title: string = "Mutationsz";

  constructor(private mutationService: MutationService) {

  }

  ngOnInit(): void {
    this.mutationService.getMutations()
      .subscribe(response => {
          response.forEach(mutation => {
            let newMutation = new Mutation().deserialize(mutation);
            this.mutations.push(newMutation)
          });
        },
        error => console.error(error),
        () => console.log(this.mutations)
      )
  }

}
