package com.kodewala.object1;

class Train
{
	String source;
	String destination;
	int seatNumber;
	String coach;
	
	public Train(String source, String destination)
	{
		this.source = source;
		this.destination = destination;
	}
	
	public Train(String source, String destination, int seatNumber)
	{
		this.source = source;
		this.destination = destination;
		this.seatNumber = seatNumber;
	}
	
	public Train(String source, String destination, int seatNumber, String coach)
	{
		this.source = source;
		this.destination = destination;
		this.seatNumber = seatNumber;
		this.coach = coach;
	}
	
	void display()
	{
		System.out.println("Source Station: "+source);
		System.out.println("Destination Station: "+destination);
		System.out.println("Coach: "+coach);
		System.out.println("Seat Number: "+seatNumber);
		System.out.println();
	}
	
}


public class Driver1
{
	 public static void main(String a[]) 
	 {
		 
		 Train pass1 = new Train("Jodhpur","K.r. Puram" );
		 Train pass2 = new Train("Jodhpur","K.r. Puram", 23 );
		 Train pass3 = new Train("Jodhpur","K.r. Puram", 23, "B2" );
		 
		 pass1.display();
		 pass2.display();
		 pass3.display();

		 
	 }
}
