package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ServiceImp.OrderServiceImp;
import com.example.demo.module.Order;
@RestController
public class OrderController {
	
@Autowired
OrderServiceImp orderserviceImp;

@GetMapping("/FindAllOrder")
public ResponseEntity<List<Order>> findAllOrder(){
	return new ResponseEntity<List<Order>> (orderserviceImp.listAllOrder(),HttpStatus.OK);
	
}
@PostMapping("/AddOrder")
public ResponseEntity<Void> addOrder(@RequestBody Order order){
	orderserviceImp.addOrder(order);
	return new ResponseEntity<Void> (HttpStatus.OK);
	
	
}
@GetMapping("/FindOrderByName{name}")
 public ResponseEntity<Order> findOrderbyName(@PathVariable String name){
	orderserviceImp.findOrderByName(name);
	return new ResponseEntity<Order>(HttpStatus.OK);
	 
 }
@DeleteMapping("/DeleteOrder")
public ResponseEntity<Void> cancelOrder(@RequestBody Order order){
	orderserviceImp.cancelOrder(order);
	return new ResponseEntity<Void>(HttpStatus.OK);
}


}
