package com.beitech.orders.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Orden {

	@Id
	@GeneratedValue
	private Long ordenId;
	private String deliveryAddress;
	private String orderDate;
	
	@ManyToOne
	private Long customerId;
	
	

	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public Long getOrdenId() {
		return ordenId;
	}
	public void setOrdenId(Long ordenId) {
		this.ordenId = ordenId;
	}
	public String getDeliveryAddress() {
		return deliveryAddress;
	}
	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	
	
	
}
