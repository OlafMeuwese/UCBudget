import {MutationType} from "./mutation-type";

export class Mutation {

  constructor(public id: number, bankAccount: number,
              public type: MutationType, public amount: number,
              public date: Date, public counterName: string,
              public counterAccount: string, public description: string) {

  }


}
