/**
 * 
 */
package com.example.gateway.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gateway.model.CustomerDTO;
import com.example.gateway.service.CustomerService;

/**
 * @author vishnu
 *
 */
@RestController
public class Controller {
	
	private final CustomerService customerService;
	
	public Controller(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	
	@GetMapping("api/customer")
	public boolean publishCustomer() {
		
		CustomerDTO customerDTO = new CustomerDTO();
		customerDTO.setName("vishnu");
		customerDTO.setAge(21);
		return customerService.publish(customerDTO);
	}
}
