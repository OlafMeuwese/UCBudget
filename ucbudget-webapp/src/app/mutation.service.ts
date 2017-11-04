import {Injectable} from "@angular/core";
import {Http} from "@angular/http";
import {Mutation} from "./mutation";

import "rxjs/add/operator/toPromise"

@Injectable()
export class MutationService {
  private mutationsAPIUrl: string = "api/mutations"

  constructor(private http: Http){

  }

  public getMutations(): Promise<Mutation[]> {
    return this.http.get(this.mutationsAPIUrl)
      .toPromise()
      .then(response => response.json().data as Mutation[])
      .catch(this.handleError)
  }

  private handleError(error: any): Promise<any> {
    console.error("An error has occured: ", error);
    return Promise.reject(error.message || error);
  }



}
