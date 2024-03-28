package com.thread;

class A extends Thread{
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println(i);
		}
	}
}
class B extends Thread{
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("Hello");
		}
	}
}
public class demothread {
	public static void main(String[] args) throws InterruptedException {
		A obj1=new A();
		B obj2 =new B();
		obj1.start();
		obj1.join();
		obj2.start();
		
	}

}
