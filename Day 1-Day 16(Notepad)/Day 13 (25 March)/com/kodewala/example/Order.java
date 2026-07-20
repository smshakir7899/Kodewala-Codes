package com.kodewala.example; //same package

public class Order
{

	public static void main(String[] args)
	{
		Customer customer = new Customer(); //Creating an object of Customer class
		
		customer.sayHello("Kodewala"); //Accessing default access member within the same pa
		System.out.println("Customer name: "+customer.customerName);
	}
}
