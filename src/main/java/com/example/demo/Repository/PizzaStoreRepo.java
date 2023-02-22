package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.module.PizzaStore;

public interface PizzaStoreRepo extends JpaRepository<PizzaStore, Integer>{

	public PizzaStore findByStoreName(String name);
	
}
