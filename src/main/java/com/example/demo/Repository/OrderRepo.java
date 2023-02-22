package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.module.Order;


public interface OrderRepo extends JpaRepository<Order, Integer> {

	public Order findByOrderName(String name);
}
