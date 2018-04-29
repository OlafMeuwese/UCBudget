import {Serializable} from "../util/Serializable";

export class User implements Serializable<User>{

  id:number;
  firstName: string;
  lastName: string;
  email: string;

  constructor(){}

  deserialize(input): User {
    this.id = input.id;
    this.firstName = input.firstName;
    this.lastName = input.lastName;
    this.email = input.email;
    return this;
  }
}
