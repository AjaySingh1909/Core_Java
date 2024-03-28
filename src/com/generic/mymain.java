package com.generic;

import java.util.ArrayList;
import java.util.List;

public class mymain {
	public static void main(String[] args) {
		List<Integer> i=new ArrayList<>();
		mymain.print(i);
	}
	private static void print(List<?> obj) {
		System.out.println(obj);
	}
}
