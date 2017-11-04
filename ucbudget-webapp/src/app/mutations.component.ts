import {Component, OnInit} from "@angular/core";
import {MutationService} from "./mutation.service";
import {Mutation} from "./mutation";
import {MutationType} from "./mutation-type";

@Component({
  selector: "mutations",
  templateUrl: "mutations.component.html"
})
export class MutationsComponent implements OnInit {

  public mutations: Mutation[] = [new Mutation(4, 5, MutationType.credit, 34.5,
    new Date("2017-4-12"), "Gerrit", "NL1", "Vierde Betaling")];
  title: string = "Mutations";

  constructor(private mutationService: MutationService) {

  }

  ngOnInit(): void {
    this.mutationService.getMutations()
      .then(mutations => this.something(mutations));
  }

  private something(hello) {
    hello.forEach(mutation => this.mutations.push(mutation));
    console.log(hello);
  }
}
