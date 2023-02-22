package com.example.demo.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.DeliveryBoyRepo;
import com.example.demo.module.DeliveryBoy;
import com.example.demo.service.DeliveryBoyServices;
@Service
public class DeliveryBoyServiceImp implements DeliveryBoyServices{
@Autowired
DeliveryBoyRepo deliveryBoyRepo; 
	@Override
	public List<DeliveryBoy> listofDeliveryBoy() {
		// TODO Auto-generated method stub
		return deliveryBoyRepo.findAll() ;
	}

	@Override
	public void addDeliveryBoy(DeliveryBoy deliveryboy) {
		// TODO Auto-generated method stub
		deliveryBoyRepo.save(deliveryboy);
	}

	@Override
	public DeliveryBoy findboybyName(String Name) {
		// TODO Auto-generated method stub
		return deliveryBoyRepo.findByDeliveryBoyName(Name);
	}

	@Override
	public void updateDeliveryBoy(DeliveryBoy boy) {
		// TODO Auto-generated method stub
		deliveryBoyRepo.save(boy);
	}

	@Override
	public void deleteDeliveryBoybyid(int id) {
		// TODO Auto-generated method stub
		deliveryBoyRepo.deleteById(id);
	}

}
