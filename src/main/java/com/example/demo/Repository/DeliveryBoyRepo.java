package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.module.DeliveryBoy;

public interface DeliveryBoyRepo extends JpaRepository<DeliveryBoy, Integer>{

	public DeliveryBoy findByDeliveryBoyName(String Name);
	

}
