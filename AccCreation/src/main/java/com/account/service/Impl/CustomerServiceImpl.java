package com.account.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.account.entities.Customer;
import com.account.repository.CustomerRepository;
import com.account.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository customerRepository;
	@Override
	public Customer addCustomer(Customer customer) {
		
		customerRepository.save(customer);
		return customer;
	}

}
