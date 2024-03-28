package com.democollection;

import java.util.EnumMap;
import java.util.Map;

public class demoenum 
{
	public enum days
	{
		Mon,Tue,Wed, Thu, Fri, Sat, Sun;
	}
	public static void main(String[] args) {
		days s=days.Fri;
		System.out.println(s.ordinal());
		EnumMap<days, Integer> p=new EnumMap<>(days.class);
		p.put(days.Mon, 1);
		p.put(days.Tue, 2);
		p.put(days.Wed, 3);
		p.put(days.Thu, 4);
		p.put(days.Fri, 5);
		p.put(days.Sat, 6);
		p.put(days.Sun, 7);
		
		for(Map.Entry<days,Integer>d:p.entrySet())
		{
			System.out.println(d.getKey()+ " "+ d.getValue()); 
		}
		
		
		}

}
