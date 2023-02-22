package com.example.demo.service;

import java.util.List;

import com.example.demo.module.DeliveryBoy;


public interface DeliveryBoyServices {
	
	public List<DeliveryBoy> listofDeliveryBoy();
	
	public void  addDeliveryBoy(DeliveryBoy deliveryboy);
	
	public DeliveryBoy findboybyName(String Name);
	
	public void updateDeliveryBoy(DeliveryBoy boy);
	
	public void deleteDeliveryBoybyid(int id);
	
	

}
