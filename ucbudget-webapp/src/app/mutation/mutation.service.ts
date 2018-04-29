import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {Mutation} from "./mutation";
import {Observable} from "rxjs/Observable";

@Injectable()
export class MutationService {
  private mutationsAPIUrl: string = "http://localhost:8080/v1/mutation/";

  constructor(private http: HttpClient) {

  }

  public getMutations(): Observable<Mutation[]>{
    console.log(this.mutationsAPIUrl);
    return this.http.get<Mutation[]>(this.mutationsAPIUrl);
  }

  private handleError(error: any): Promise<any> {
    console.error("An error has occured: ", error);
    return Promise.reject(error.message || error);
  }


}
