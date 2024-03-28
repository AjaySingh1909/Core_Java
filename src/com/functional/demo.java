package com.functional;


@FunctionalInterface
interface A{
	void show();
}


interface B{
	int add(int a , int b);
}

//class B implements A{
//
//	@Override
//	public void show() {
//		// TODO Auto-generated method stub
//		System.out.println("Hello");
//		
//	}
//	
//}
public class demo {
	public static void main(String[] args) {
		int x=45, y=56;
//		A obj =new A()
//				{
//			public void show() {
//				System.out.println("hello");                    //Anonymous class used in version 1.7.
//			}                                                   // Below is the optimized alternative
//				};
//				obj.show();
	
	
	A obj =()->                             //Lambda function in Java 8
	 {
	System.out.println("hello");
	};
	obj.show();
	
	
	B obj1=(int a, int b)->
	{
		return a+b;
	};
	System.out.println(obj1.add(x,y));
}
}


