package com.kodewala.polymorphism;

class Delivery
{
	public void doDelivery() 
	{
		System.out.println("Delivery.doDelivery()");
	}
}

class EComDelivery extends Delivery
{
	public void doDelivery() 
	{
		System.out.println("EComDelivery.doDelivery()");
	}
}

public class Driver1
{

	public static void main(String[] args)
	{
 
		Delivery delivery = new EComDelivery(); // parent class can refer child class object (auto up casting)
		// use of polymorphism is you can store multiple child object...for e.g. delivery = new FoodDelivery(); 
		
		delivery.doDelivery(); // compile time it check + it call based on actual object
		// it does not call parent class object
		// at compile time it only checks that Delivery class is present or not
		// then at run time it will refer the actual object i.e. EComDelivery ---> process method of ECom class
		// which method to call is decide at run time thats why it is called run time polymorphism
			/* JVM STEPS: 
			Step 1: Actual object dekho => EComDelivery
			Step 2: Kya EComDelivery me doDelivery() hai? --> YES  if there is nothing in child class then it will execute parent class
			Step 3: Usko execute karo */
	}

}
