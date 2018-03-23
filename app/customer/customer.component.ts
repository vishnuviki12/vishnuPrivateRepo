import { Component, OnInit } from '@angular/core';

import { Customer } from './customer';
import { CustomerService } from './customer.service';

@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css']
})
export class CustomerComponent implements OnInit {
  customer = new Customer;
  custom: Customer;
  customers: Customer[];

  constructor(private service: CustomerService) {
    this.custom = new Customer;
    
    
   }

  ngOnInit() {
  }


  save(): void {
  
    this.service.save({firstName: this.customer.firstName, lastName: this.customer.lastName});
  }

  get() {
    this.service.get().then(customer => this.custom = customer);
    
  }

  getAll() {
    this.service.getAll().then(customers => this.customers = customers);
    
  }

}
