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

  public mutations: Mutation[] = [new Mutation(4, 5, MutationType.credit, 34.5,
    new Date("2017-4-12"), "Vijfde Betaling", "Gerrit","NL1", )];
  title: string = "Mutationsz";

  constructor(private mutationService: MutationService) {

  }

  ngOnInit(): void {
    this.mutationService.getMutations()
      .subscribe(mutationArray => mutationArray.forEach(
        mutation => {
          console.log("Date "+mutation.recordDate);
          this.mutations.push(mutation)
        }
        ),
        error => console.error(error),
        () => console.log(this.mutations));
  }

  private something(hello) {
    hello.forEach(mutation => this.mutations.push(mutation));
    console.log(hello);
  }
}
