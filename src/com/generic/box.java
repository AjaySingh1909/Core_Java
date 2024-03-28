package com.generic;

public class box<T> {
	T cot;
	
	public box(T cot) {
		this.cot=cot;
	}
	
	public void getValue() {
		System.out.println(this.cot);
	}
	

}
