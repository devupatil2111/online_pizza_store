package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ServiceImp.DeliveryBoyServiceImp;
import com.example.demo.module.DeliveryBoy;
import com.example.demo.module.Item;
@RestController
public class DeliveryBoyController {
	
@Autowired
DeliveryBoyServiceImp deliveryboyServiceImp;

@GetMapping("/findAllDeliveryBoyList")
public ResponseEntity<List<DeliveryBoy>> findAllDeliveryBoyList(){
	deliveryboyServiceImp.listofDeliveryBoy();	
	return new ResponseEntity<List<DeliveryBoy>>(HttpStatus.OK);	
}
@PostMapping("/addDeliveryBoy")
public ResponseEntity<Void> addDelivery(@RequestBody DeliveryBoy deliveryboy){
	deliveryboyServiceImp.addDeliveryBoy(deliveryboy);	
	return new ResponseEntity<Void>(HttpStatus.OK);	
}
@GetMapping("/findDeliveryBoybyName/{name}")
public ResponseEntity<DeliveryBoy>findboybyName(@PathVariable String name){
	deliveryboyServiceImp.findboybyName(name);
	return new ResponseEntity<DeliveryBoy>(HttpStatus.OK);
}
@PostMapping("/updateDeliveryBoy")
public ResponseEntity<Void>updateDeliveryBoy(@RequestBody DeliveryBoy boy){
	deliveryboyServiceImp.updateDeliveryBoy(boy);
	return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
}
@DeleteMapping("/deleteDeliveryBoy/{name}")
public ResponseEntity<Void>	deleteDeliveryBoybyid(@PathVariable int id){
	deliveryboyServiceImp.deleteDeliveryBoybyid(id);
return new ResponseEntity<Void>(HttpStatus.OK);

}
	
}
	

