package com.account.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.account.entities.Customer;
import com.account.service.CustomerService;

@RestController
@RequestMapping(path = "/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping(path = "addcustomer")
	public ResponseEntity<Customer> createAccount(@RequestBody Customer customer) {
		return new ResponseEntity<Customer>(customerService.addCustomer(customer),HttpStatus.OK);
		
	}

}
