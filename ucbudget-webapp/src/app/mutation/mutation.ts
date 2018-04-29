import {MutationType} from "./mutation-type";
import {Serializable} from "../util/Serializable";

export class Mutation implements Serializable<Mutation>{
  id:number;
  bankAccount:number;
  type: MutationType;
  private _amount: number;
  recordDate: Date;
  description: string;
  counterName: string;
  counterAccountNumber;
  constructor() {
  }

  deserialize(input): Mutation {
    this.id = input.id;
    this.bankAccount = input.bankAccount;
    this.type = input.type;
    this._amount = input.amount;
    this.recordDate = new Date(input.recordDate);
    this.description = input.description;
    this.counterName = input.counterName;
    this.counterAccountNumber = input.counterAccountNumber;

    return this;
  }

  get amount(): number{
    return this._amount + 100;
  }


}
