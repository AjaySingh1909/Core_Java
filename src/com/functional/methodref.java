package com.functional;


@FunctionalInterface
interface C{
	int f1(int a);
}

 

public class methodref {
	
	
		public 
		//static
		int f2(int a) {
			return a*a*a;
		}
	
		public static void main(String[] args) {
			//C obj1=methodref::f2;
			//C obj2=(int a)->a*a;
			methodref obj3=new methodref();
			C obj4=obj3::f2;
			System.out.println(obj4.f1(2));
			
			
		}
}



