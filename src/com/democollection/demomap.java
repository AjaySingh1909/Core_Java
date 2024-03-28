package com.democollection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.assignmentEmp.Employee;

public class demomap {
	public static void main(String[] args) {
		Map<Integer, String> str=new HashMap<>();
		str.put(10,"Bangalore");
		str.put(6, "Delhi");
		str.put(null,"Noida");
		str.put(56, "Wazidpur");
		str.put(32, "Ghaziabad");
		System.out.println(str);
		
		//Set<Entry<Integer,String>> s=str.entrySet();
		
		
		
		Map<Integer, Employee> mp=new HashMap<>();
		mp.put(1, new Employee("ajay", 123, 32000));
		System.out.println(mp);
		System.out.println(mp.entrySet());
		

		//mp.getOrDefault(mp, null);

		LinkedHashMap<Integer, String> lhm=new LinkedHashMap<>();
		lhm.put(75, "vikas");
		lhm.put(23, "Ravi");
		lhm.put(26,"akash");
		lhm.put(34, "amit");
		System.out.println(lhm);
		System.out.println(lhm.get(75));
		System.out.println(lhm.containsKey(20));
	}
}
