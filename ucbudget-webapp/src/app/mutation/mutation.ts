import {MutationType} from "./mutation-type";

export class Mutation {

  constructor(id: number, bankAccount: number,
              type: MutationType, public amount: number,
              public recordDate: Date, description: string, counterName: string,
              counterAccountNumber: string) {
  }


}
