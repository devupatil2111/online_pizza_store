package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ServiceImp.CustomerServiceImp;
import com.example.demo.module.Customer;
@RestController 
public class CustomerController {
	
	@Autowired
	CustomerServiceImp  customeservicImp;
	
	@GetMapping("/viewAllCustomerList")
	public ResponseEntity<List<Customer>> findAllCustomer(){
		return new ResponseEntity<List<Customer>>(customeservicImp.listAllCustomer(), HttpStatus.OK);
		
	}
	@PostMapping("/saveCustomer")
	public ResponseEntity<Void> addCustomer(@RequestBody Customer cust ) {
		customeservicImp.addCustomer(cust);
		
		return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
	
		
	}
	@GetMapping("/findCustomerByName/{name}")
	public ResponseEntity<Customer> findCustomerbyName(@PathVariable String name){
		customeservicImp.findCustomerByName(name);
		
		return new ResponseEntity<Customer>(HttpStatus.ACCEPTED);
		
	}
	@PutMapping("/updateCutomer")
	public ResponseEntity<Void> updateCustomer(@RequestBody Customer customer ){
		customeservicImp.updateCustomer(customer);
		return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
		
		
	}
	
	

}
