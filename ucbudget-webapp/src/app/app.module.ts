import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppComponent} from './app.component';
import {MutationsComponent} from "./mutations.component";
import {MutationService} from "./mutation.service";
import {HttpModule} from "@angular/http";
import {InMemoryWebApiModule} from "angular-in-memory-web-api";
import {InMemoryDataService} from "./in-memory-data-service";

@NgModule({
  declarations: [
    AppComponent,
    MutationsComponent
  ],
  imports: [
    BrowserModule,
    HttpModule,
    InMemoryWebApiModule.forRoot(InMemoryDataService)
  ],
  providers: [MutationService],
  bootstrap: [AppComponent]
})
export class AppModule { }
