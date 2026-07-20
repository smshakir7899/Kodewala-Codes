package com.kodewala.inc3;

public class RestaurentOrder
{
	private String dish;
	boolean isAvailable = false;

	public synchronized void chef(String dish) throws InterruptedException
	{
		while (isAvailable)

		{
			wait();
		}
		this.dish = dish;

		System.out.println("Preparing " + dish);
		System.out.println("Chef prepared: " + dish);
		isAvailable = true;
		notify();
	}

	public synchronized void customer() throws InterruptedException
	{
		while (!isAvailable)
		{
			wait();
		}

		System.out.println("Customer ate: " + dish);
		System.out.println("Table is empty again...");
		isAvailable = false;
		notify();
	}

}
