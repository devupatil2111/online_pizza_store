package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.module.Item;

public interface ItemRepo extends JpaRepository<Item, Integer>{

	public Item findByItemName(String name);
}
