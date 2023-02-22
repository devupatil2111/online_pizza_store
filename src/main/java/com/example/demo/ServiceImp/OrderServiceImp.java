package com.example.demo.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.OrderRepo;
import com.example.demo.module.Order;
import com.example.demo.service.OrderServices;
@Service
public class OrderServiceImp implements OrderServices{
@Autowired
OrderRepo orderrepo;
	@Override
	public List<Order> listAllOrder() {
		// TODO Auto-generated method stub
		return orderrepo.findAll();
	}

	@Override
	public void addOrder(Order order) {
		// TODO Auto-generated method stub
		orderrepo.save(order);
	}

	@Override
	public Order findOrderByName(String name) {
		// TODO Auto-generated method stub
		return orderrepo.findByOrderName(name);
	}

	@Override
	public void cancelOrder(Order order) {
		// TODO Auto-generated method stub
		orderrepo.delete(order);
	}
	
	

}
