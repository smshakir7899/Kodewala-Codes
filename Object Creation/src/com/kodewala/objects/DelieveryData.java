package com.kodewala.objects;

class Delievery2
{
	String customerName;
	String itemName;
	String delDate;
	String status;
	
	Delievery2()
	{
		System.out.println("Default Values");
		System.out.println("Customer Name: "+customerName);
		System.out.println("Item Name: "+itemName);
		System.out.println("Delievery Date: "+delDate);
		System.out.println("Status: "+status);
	}
}

public class DelieveryData
{

	public static void main(String[] args)
	{

		Delievery2 user = new Delievery2();

	}

}
