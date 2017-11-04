import {InMemoryDbService} from "angular-in-memory-web-api";
import {Mutation} from "./mutation";
import {MutationType} from "./mutation-type";

export class InMemoryDataService implements InMemoryDbService {
  createDb() {
    const mutations: Mutation[] = [
      new Mutation(1, 1, MutationType.credit, 10, new Date("2017-10-12"),
         "NL03ONZIN1234567890", "H. de Gier", "Eerste Betaling"),
    new Mutation(2,1, MutationType.credit, 20,new Date("2017-10-12"),
        "NL03ONZIN1234567890", "H. de Gier", "Tweede Betaling"),
    new Mutation(3,1, MutationType.debit, 25,new Date("2017-10-12"),
        "NL03ONZIN1234567890", "H. de Gier", "Derde Betaling")
    ];
    return {mutations};
  }
}
