package com.kodewala.polymorphism.realexp;

public class Driver
{

	public static void main(String[] args)
	{
		DeliveryProcessor deliveryProcessor = new DeliveryProcessor();
		
		FoodDelivery foodDelivery = new FoodDelivery(); 
		deliveryProcessor.processDelivery(foodDelivery);
		
		//with the same class of driver on can access(or call) multiple classes
		CourierDelivery courierDelivery = new CourierDelivery();
		deliveryProcessor.processDelivery(courierDelivery);
	}

}
