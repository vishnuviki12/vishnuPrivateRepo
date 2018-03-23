import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { RouterModule } from '@angular/router';

import { AppComponent } from './app.component';
import { CustomerComponent } from './customer/customer.component';
import { TestComponent } from './test/test.component';
import { CustomerService } from './customer/customer.service';

@NgModule({
  declarations: [
    AppComponent,
    CustomerComponent,
    TestComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    RouterModule.forRoot([
      {
        path: 'customer',
        component: CustomerComponent
      },
      {
        path: 'test',
        component: TestComponent
      }
    ])
  ],
  providers: [CustomerService],
  bootstrap: [AppComponent]
})
export class AppModule { }
