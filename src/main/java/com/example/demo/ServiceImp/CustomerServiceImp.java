package com.example.demo.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.CustomerRepository;
import com.example.demo.module.Customer;
import com.example.demo.service.CustomerService;

@Service
public class CustomerServiceImp implements CustomerService{
@Autowired
CustomerRepository customerRepository; 
	@Override
	public List<Customer> listAllCustomer() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}

	@Override
	public void addCustomer(Customer cust) {
		// TODO Auto-generated method stub
		customerRepository.save(cust);
		
	}

	@Override
	public Customer findCustomerByName(String name) {
		// TODO Auto-generated method stub
		return customerRepository.findByName(name);
	}

	@Override
	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerRepository.save(customer);
	}
	
	
	
	

}
