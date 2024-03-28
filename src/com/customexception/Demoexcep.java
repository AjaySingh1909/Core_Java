package com.customexception;

public class Demoexcep {
	public static void main(String[] args) throws invalidedge
	{
		try {
		validateage(-1);
		}
		catch(invalidedge e) {
			e.printStackTrace();
		}
		
	}
	public static void validateage(int age) throws invalidedge 
	{
		if(age<0) {
			throw new invalidedge("Invalid Age");
		}
		
	}
}
