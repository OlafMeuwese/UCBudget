import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {MutationListComponent} from "./mutation/mutation-list.component";
import {MutationService} from "./mutation/mutation.service";
import {AppComponent} from "./app.component";
import {HttpClientModule} from "@angular/common/http";
import {MutationComponent} from "./mutation/mutation.component";
import {BankAccountComponent} from './bank-account/bank-account.component';
import {BankComponent} from './bank/bank.component';
import {UserService} from "./user/user.service";
import {UserListComponent} from "./user/user-list.component";
import {UserComponent} from "./user/user.component";

@NgModule({
  declarations: [
    AppComponent,
    BankAccountComponent,
    BankComponent,
    MutationComponent,
    MutationListComponent,
    UserListComponent,
    UserComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule
  ],
  providers: [
    MutationService,
    UserService
  ],
  bootstrap: [AppComponent]
})
export class AppModule {
}
