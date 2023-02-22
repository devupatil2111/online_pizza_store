package com.example.demo.module;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class DeliveryBoy {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String deliveryBoyName;
	private String contactnumber;
	private boolean isAvalibile;
	@OneToMany
	private List<Order> order;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDeliveryBoyName() {
		return deliveryBoyName;
	}
	public void setDeliveryBoyName(String deliveryBoyName) {
		this.deliveryBoyName = deliveryBoyName;
	}
	public String getContactnumber() {
		return contactnumber;
	}
	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}
	public boolean isAvalibile() {
		return isAvalibile;
	}
	public void setAvalibile(boolean isAvalibile) {
		this.isAvalibile = isAvalibile;
	}
	public List<Order> getOrder() {
		return order;
	}
	public void setOrder(List<Order> order) {
		this.order = order;
	}
	@Override
	public String toString() {
		return "DeliveryBoy [id=" + id + ", deliveryBoyName=" + deliveryBoyName + ", contactnumber=" + contactnumber
				+ ", isAvalibile=" + isAvalibile + ", order=" + order + "]";
	}
	
	

}
