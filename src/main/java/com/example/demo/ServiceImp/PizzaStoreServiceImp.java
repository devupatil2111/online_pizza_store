package com.example.demo.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.PizzaStoreRepo;
import com.example.demo.module.PizzaStore;
import com.example.demo.service.PizzaStoreServices;
@Service
public class PizzaStoreServiceImp implements PizzaStoreServices{
@Autowired
PizzaStoreRepo pizzaStoreRepo;
	@Override
	public List<PizzaStore> listAllPizzaStore() {
		// TODO Auto-generated method stub
		return pizzaStoreRepo.findAll();
	}

	@Override
	public void addStore(PizzaStore store) {
		// TODO Auto-generated method stub
		pizzaStoreRepo.save(store);
	}

	@Override
	public PizzaStore findStoreByName(String name) {
		// TODO Auto-generated method stub
		return pizzaStoreRepo.findByStoreName(name);
	}

	@Override
	public void updatePizzaStore(PizzaStore pizzastore) {
		// TODO Auto-generated method stub
		pizzaStoreRepo.save(pizzastore);
	}

	@Override
	public void deleteStorebyId(int id) {
		// TODO Auto-generated method stub
		pizzaStoreRepo.deleteById(id);;
	}

	

}
