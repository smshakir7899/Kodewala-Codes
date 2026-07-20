package com.kodewala.inheritance;

public class Order
{
	int orderId;

	public Order(int orderId)
	{
		super();
		this.orderId = orderId;
	}
	
	void placeOrder()
	{
		System.out.println("Order Placed. Order ID: " + orderId);
	}
	
}
