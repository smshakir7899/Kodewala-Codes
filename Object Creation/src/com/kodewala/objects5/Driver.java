package com.kodewala.objects5;

class  MovieTicket
{
	String moviesName;
	int seats;
	int amount;
	String bookingStatus;
	
	
	MovieTicket(String movieName, int seats, int amount)
	{
		this(movieName, seats, amount, "CONFIRMED");
	}
	
	MovieTicket(String movieName, int seats, int amount, String bookingStatus)
	{
		this.moviesName = movieName;
		this.seats = seats;
		this.amount = amount;
		this.bookingStatus = bookingStatus;
		
		
	}
	
	
	void display()
	{
		System.out.println("Movie Name: "+moviesName);
		System.out.println("Seats Booked: "+seats);
		System.out.println("Total Amount: "+amount);
		System.out.println("Booking Status: "+bookingStatus);
	}
}

public class Driver 
{
	public static void main(String[] args) 
	{
		MovieTicket m1 = new MovieTicket("Avangers", 2, 800);
		
		m1.display();
	}
}
