package com.example.demo.service;

import java.util.List;


import com.example.demo.module.Item;

public interface ItemService {
	
public List<Item> listAllItem();
	
	public void addItem(Item food);
	
	public Item  findItemByName(String name);
	
	public void updateItem(Item item);
	
	public void deleteItembyid(int id);
	

}


