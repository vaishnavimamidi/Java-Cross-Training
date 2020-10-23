package com.nttdata.Assignment;

import java.util.HashMap;

public class Customer implements Comparable {
	
	private int id;
	private String name;
	private String password;
	private int totalPrice;
	private String city;
	
	public Customer(int id, String name, String password, int totalPrice, String city) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.totalPrice = totalPrice;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", password=" + password + ", totalPrice=" + totalPrice
				+ ", city=" + city + "]";
	}

	public int compareTo(Customer c) {
		// TODO Auto-generated method stub
		if(c.totalPrice<this.totalPrice)
		{
			return 1;	
		}
		else if(c.totalPrice>this.totalPrice)
		{
			return -1;
		}
		return 0;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	

}
