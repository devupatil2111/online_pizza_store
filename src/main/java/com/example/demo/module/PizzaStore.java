package com.example.demo.module;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PizzaStore {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int storeId;
	private String storeName;
	private String storeLocation;
	public int getStoreId() {
		return storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getStoreLocation() {
		return storeLocation;
	}
	public void setStoreLocation(String storeLocation) {
		this.storeLocation = storeLocation;
	}
	@Override
	public String toString() {
		return "PizzaStore [storeId=" + storeId + ", storeName=" + storeName + ", storeLocation=" + storeLocation + "]";
	}
	
	
	
	

}
