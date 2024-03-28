package com.democollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class demoarrays {
	public static void main(String[] args) {
		List<Integer> num=new ArrayList<>();   //list is interface & ArrayList is class
		num.addAll(Arrays.asList(30,78,13));
		num.add(10);
		num.add(20);
		num.add(1, 29);
		List<Integer> num1=new ArrayList<>();
		num1.add(12);
		num1.add(19);
		System.out.println(num);
		num.addAll(num1);
		System.out.println(num);
		
//		List<Employee> emp=new ArrayList<>();
//		Collections.sort(emp);

//		int [] arr= {3,4,2,6,4,8,9};
//		Arrays.sort(arr);
//		for(int i:arr) {
//			System.out.println(i);
//		}
	}
}
