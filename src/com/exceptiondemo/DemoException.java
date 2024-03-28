package com.exceptiondemo;

public class DemoException {
	public static void main(String[] args)
	{
		int[] num= {2,3,4};
		try {
			//System.out.println(10/0);
			System.out.println(num[5]);
			System.out.println("hello"); // will not get executed if there is already an exception thrown before 
		}
		catch (Exception e){
			e.printStackTrace(); //trace the path of exception
			//System.out.println(e);
		}
		
	
	}
}
