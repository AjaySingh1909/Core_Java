package com.file;

import java.io.Serializable;

public class Product implements Serializable {
	String name;
	int it;
	double price;
	public Product(String name, int it, double price) {
		super();
		this.name = name;
		this.it = it;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", it=" + it + ", price=" + price + "]";
	}
	
	

}
