package com.thread;


public class First extends Thread {
	static  BookTicket b;
	int st;
	
	
	@Override
	public void run() {
		
		b.bookTicket(st);
	}
	
	public static void main(String[] args) throws InterruptedException {
		b=new BookTicket();
		First f1 = new First();
		
		First f2 = new First();
		
		First f3 = new First();
		First f4 = new First();
		First f5 = new First();
		First f6 = new First();
		
		f1.st=6;
		f2.st=9;
		f3.st = 4;
		f4.st = 5;
		f5.st = 7;
		f6.st = 8;
		f1.start();
		f2.start();
		f3.start();
		f4.start();
		f5.start();
		f6.start();		
		
	}
 
}
 