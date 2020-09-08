package com.spring.orm.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customer_Details")
public class Customer {
	
	@Id
	private int Customer_id;
	private String Customer_name;
	private String Customer_email;
	private long Customer_mobno;
	private String Customer_location;
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Customer(int customer_id, String customer_name, String customer_email, long customer_mobno,
			String customer_location) {
		super();
		Customer_id = customer_id;
		Customer_name = customer_name;
		Customer_email = customer_email;
		Customer_mobno = customer_mobno;
		Customer_location = customer_location;
	}


	public int getCustomer_id() {
		return Customer_id;
	}


	public void setCustomer_id(int customer_id) {
		Customer_id = customer_id;
	}


	public String getCustomer_name() {
		return Customer_name;
	}


	public void setCustomer_name(String customer_name) {
		Customer_name = customer_name;
	}


	public String getCustomer_email() {
		return Customer_email;
	}


	public void setCustomer_email(String customer_email) {
		Customer_email = customer_email;
	}


	public long getCustomer_mobno() {
		return Customer_mobno;
	}


	public void setCustomer_mobno(long customer_mobno) {
		Customer_mobno = customer_mobno;
	}


	public String getCustomer_location() {
		return Customer_location;
	}


	public void setCustomer_location(String customer_location) {
		Customer_location = customer_location;
	}


	@Override
	public String toString() {
		return "Customer [Customer_id=" + Customer_id + ", Customer_name=" + Customer_name + ", Customer_email="
				+ Customer_email + ", Customer_mobno=" + Customer_mobno + ", Customer_location=" + Customer_location
				+ "]";
	}

	
	
}


