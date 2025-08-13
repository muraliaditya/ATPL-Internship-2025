package com.aaslin.spring.myfirstproject;

public class Order {
	private String order_id;
	private String order_name;
	private Customer customer;
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public String getOrder_name() {
		return order_name;
	}
	public void setOrder_name(String order_name) {
		this.order_name = order_name;
	}
	public String getCustomer() {
		return "Customer is "+customer.getName();
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}   
}
