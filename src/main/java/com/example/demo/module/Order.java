package com.example.demo.module;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "cart")
public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int orderId;
	private String orderName;
	private int orderQuantity;
	private String custLocation;
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public int getOrderQuantity() {
		return orderQuantity;
	}
	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
	}
	public String getCustLocation() {
		return custLocation;
	}
	public void setCustLocation(String custLocation) {
		this.custLocation = custLocation;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderName=" + orderName + ", orderQuantity=" + orderQuantity
				+ ", custLocation=" + custLocation + "]";
	}
	
	
	
		

}
