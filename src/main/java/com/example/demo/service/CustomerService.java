package com.example.demo.service;

import java.util.List;

import com.example.demo.module.Customer;

public interface CustomerService {
	
	public List<Customer> listAllCustomer();
	
	public void addCustomer(Customer cust);
	
	public Customer findCustomerByName(String name);
	
	public void updateCustomer(Customer customer);
	

}
