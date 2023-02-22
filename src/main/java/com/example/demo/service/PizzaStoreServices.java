package com.example.demo.service;

import java.util.List;

import com.example.demo.module.PizzaStore;

public interface PizzaStoreServices {
	
	public List<PizzaStore> listAllPizzaStore();
	
	public void addStore(PizzaStore store);
	
	public PizzaStore findStoreByName(String name);
	
	public void updatePizzaStore(PizzaStore pizzastore);
	
	public void deleteStorebyId(int id);

	

	
	

}


