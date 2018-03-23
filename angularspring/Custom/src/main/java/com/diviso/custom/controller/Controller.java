/**
 * 
 */
package com.diviso.custom.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diviso.custom.customer.Customer;

/**
 * @author vishnu
 *
 */
@RestController
public class Controller {
	
	@PostMapping("/customer/save")
	public void save(@RequestBody Customer customer) {
		
		System.out.println(customer);
	}
	
	@GetMapping("/customer/get")
	public Customer find() {
		
		Customer customer = new Customer();
		customer.setFirstName("vishnu");
		customer.setLastName("viki");
		
		return customer;
	}
	
	@GetMapping("/customer/getAll")
	public List<Customer> getAll() {
		
		List<Customer> customers = new ArrayList<Customer>();
		
		Customer customer1 = new Customer();
		customer1.setFirstName("vishnu");
		customer1.setLastName("viki");
		
		Customer customer2 = new Customer();
		customer2.setFirstName("arun");
		customer2.setLastName("babu");
		
		customers.add(customer1);
		customers.add(customer2);
		
		return customers;
		
	}
}
