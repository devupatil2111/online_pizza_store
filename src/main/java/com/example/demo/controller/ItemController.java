package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ServiceImp.ItemServicesImp;
import com.example.demo.module.Customer;
import com.example.demo.module.Item;

@RestController
public class ItemController {
	
@Autowired
ItemServicesImp itemServicesImp;

@GetMapping("/viewAllItemList")
public ResponseEntity<List<Item>> findAllItem(){
	itemServicesImp.listAllItem();
	return new ResponseEntity<List<Item>>(HttpStatus.OK);
	
}
@PostMapping("/saveItem")
public ResponseEntity<Void> addCustomer(@RequestBody Item item ) {
	itemServicesImp.addItem(item);
	
	return new ResponseEntity<Void>(HttpStatus.ACCEPTED);

	
}
@GetMapping("/findItemByName{name}")
public ResponseEntity<Item> findItembyName(@PathVariable String name){
	itemServicesImp.findItemByName(name);
	
	return new ResponseEntity<Item>(HttpStatus.ACCEPTED);
	
}
@PutMapping("/updateItem")
public ResponseEntity<Void> updateItem(@RequestBody Item item ){
	itemServicesImp.updateItem(item);
	return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
	
	
}
@DeleteMapping("/deleteItem{id}")
public ResponseEntity<Void> DeleteItemByItem(@PathVariable int id ){
	itemServicesImp.deleteItembyid(id);
	return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
	
	
}

}
