package com.streamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<product> plist =new ArrayList<>();
		plist.add(new product(100, "laptop",45000));
		plist.add(new product(101, "Mobile",15000));
		plist.add(new product(103, "RAM",3500));
		plist.add(new product(104, "Keyboard",500));
		plist.add(new product(105, "CPU",40000));
		
		//plist.stream().filter(p->p.price>=35000).forEach(n->System.out.println(n));
		
		//plist.stream().map(s->s.price+100).forEach(s->System.out.println(s)); //doesn't update the actual values 
		
		//plist.stream().filter(p->p.price>=35000).forEach(n->System.out.println(n));
		
		//List<product> l=plist.stream().filter(p->p.price>=35000).collect(Collectors.toList());
		//System.out.println(l);
		
		
		//plist.stream().sorted((e1,e2)->(int)e1.price-(int)e2.price).forEach(z->System.out.println(z));
		Map<String, Long> ct=plist.stream()
				.collect(Collectors.groupingBy(product::getName,Collectors.counting()));
		System.out.println(ct);
		plist.stream().filter(p->p.getName().equals("laptop")).forEach(System.out::println);
		
		Optional<product> maxPrice=
				plist.stream()
				.collect(Collectors.maxBy(Comparator.comparing(product::getPrice)));
		System.out.println(maxPrice);
	}

}