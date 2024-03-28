package com.streamAPI;

public class product {
	int num;
	String name;
	double price;
	public product(int num, String name, double price) {
		this.num = num;
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "product [num=" + num + ", name=" + name + ", price=" + price + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
		
	}
	public void setPrice(double price) {
		this.price = price;
	}

}
