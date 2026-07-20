package com.kodewala.str.junebatch;

public class Driver
{

	public static void main(String[] args)
	{
		OrderNotification notification = new OrderNotification();
		String printMsg = notification.sendNotification("Shakir", "iPhone 18 Pro Max", "Shipped", "12th Jan 2027");
		System.out.println(printMsg);
	}

}

