import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {MutationListComponent} from "./mutation/mutation-list.component";
import {MutationService} from "./mutation/mutation.service";
import {AppComponent} from "./app.component";
import {HttpClientModule} from "@angular/common/http";

@NgModule({
  declarations: [
    AppComponent,
    MutationListComponent,
  ],
  imports: [
    BrowserModule,
    HttpClientModule
  ],
  providers: [MutationService],
  bootstrap: [AppComponent]
})
export class AppModule {
}
