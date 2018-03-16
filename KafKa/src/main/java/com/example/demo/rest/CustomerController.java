
/**
 *
 */
package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;
import com.example.demo.service.PublishCustomerService;

import lombok.extern.slf4j.Slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @author vishnu
 *
 */
@RestController
public class CustomerController {

	private final PublishCustomerService publishCustomerService;

	private final Logger log = LoggerFactory.getLogger(CustomerController.class);

	CustomerController(PublishCustomerService publishCustomerService) {

		this.publishCustomerService = publishCustomerService;
	}

	@GetMapping("api/customer")
	public boolean getMessage() {
		log.info("server called");
		Customer customer = new Customer();
		customer.setName("vishnu") ;
		customer.setEmail("vishnu@gmail.com") ;
		return this.publishCustomerService.sendMessage(customer);

	}

}
