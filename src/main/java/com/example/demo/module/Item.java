package com.example.demo.module;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Item {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int itemId;
	private String itemName;
	private String quantity;
	@ManyToMany
	private List<Customer> customer;
	@OneToOne
	private PizzaStore store;
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public List<Customer> getCustomer() {
		return customer;
	}
	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}
	public PizzaStore getStore() {
		return store;
	}
	public void setStore(PizzaStore store) {
		this.store = store;
	}
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", quantity=" + quantity + ", customer=" + customer
				+ ", store=" + store + "]";
	}
	
	
}
