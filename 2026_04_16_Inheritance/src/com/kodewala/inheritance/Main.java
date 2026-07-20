package com.kodewala.inheritance;


class OnlineOrder extends Order
{

	public OnlineOrder(int orderId)
	{
		super(orderId);
	}
	
	void sendEmail()
	{
		System.out.println("Confirmation Email Sent.");
	}
	
}

class StoreOrder extends Order
{

	public StoreOrder(int orderId)
	{
		super(orderId);
	}
	
	void printBill()
	{
		System.out.println("Store Bill Printed.");
	}
	
}
public class Main
{

	public static void main(String[] args)
	{

		OnlineOrder o1 = new OnlineOrder(101);
		o1.placeOrder();
		o1.sendEmail();
		
		System.out.println();
		
		StoreOrder o2 = new StoreOrder(102);
		o2.placeOrder();
		o2.printBill();
		
	}

}
