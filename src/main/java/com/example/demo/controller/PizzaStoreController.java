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

import com.example.demo.ServiceImp.PizzaStoreServiceImp;
import com.example.demo.module.PizzaStore;

@RestController
public class PizzaStoreController {
	
	@Autowired
	PizzaStoreServiceImp pizzastoreserviceImp;
	
	@GetMapping("/findAllPizzaStoreList")
	public ResponseEntity<List<PizzaStore>> findAllPizzaStoreList(){
		pizzastoreserviceImp.listAllPizzaStore();	
		return new ResponseEntity<List<PizzaStore>>(HttpStatus.OK);	
	}
	@PostMapping("/addPizzaStore")
	public ResponseEntity<Void> addPizzaStore(@RequestBody PizzaStore pizzaStore){
		pizzastoreserviceImp.addStore(pizzaStore);	
		return new ResponseEntity<Void>(HttpStatus.ACCEPTED);	
	}
	@GetMapping("/findPizzaStorebyName/{name}")
	public ResponseEntity<PizzaStore>findPizzaStorebyName(@PathVariable String name){
		pizzastoreserviceImp.findStoreByName(name);
		return new ResponseEntity<PizzaStore>(HttpStatus.OK);
	}
	@PostMapping("/updatePizzaStore")
	public ResponseEntity<Void>updatePizzaStore(@RequestBody PizzaStore store){
		pizzastoreserviceImp.updatePizzaStore(store);
		return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
	}
	@DeleteMapping("/deletePizzaStore/{id}")
	public ResponseEntity<Void>	deletePizzaStorebyid(@PathVariable int id){
		pizzastoreserviceImp.deleteStorebyId(id);
	return new ResponseEntity<Void>(HttpStatus.OK);

	}
		
	}
		


	


