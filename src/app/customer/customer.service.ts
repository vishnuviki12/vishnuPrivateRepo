import { Injectable } from '@angular/core';
import { Headers,Http } from '@angular/http';
import { Customer } from './customer';
import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/toPromise';


@Injectable()
export class CustomerService {
private headers = new Headers({'content-Type': 'application/json'});

  constructor(private http: Http) { }

  save(customer: Customer) {
   
    return this.http.post(`http://localhost:8080/customer/save`, JSON.stringify(customer), {headers: this.headers})
    .toPromise()
   

  }

  private handleError(error: any): Promise<any> {

    console.error('Error', error);
    return Promise.reject(error.message || error);
  }

  get() {
   
    return this.http.get(`http://localhost:8080/customer/get`)
    .toPromise()
    .then(response => response.json() as Customer)
    
  }

  getAll() {
    
     return this.http.get(`http://localhost:8080/customer/getAll`)
     .toPromise()
     .then(response => response.json() as Customer[])
     
   }

}
