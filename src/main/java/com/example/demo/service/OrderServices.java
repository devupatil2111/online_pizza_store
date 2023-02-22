package com.example.demo.service;

import java.util.List;

import com.example.demo.module.Order;


public interface OrderServices {
public List<Order> listAllOrder();
	
	public void addOrder(Order order);
	
	public Order findOrderByName(String name);
	
	public void cancelOrder(Order order);
	

}


