package com.thread;

public class BookTicket {
	
	public  int numberOfSeats = 10;
	
		synchronized void bookTicket(int seat) {
		
		if (seat <= numberOfSeats) {
			
			numberOfSeats -= seat;
			System.out.println("Seat : " + seat + " Booked, " + "Left : " + numberOfSeats);
		}
		else {
			System.out.println("Enough seats not available trying to book : " + seat + ", Left : " + numberOfSeats);
		}
		
	}
 
}