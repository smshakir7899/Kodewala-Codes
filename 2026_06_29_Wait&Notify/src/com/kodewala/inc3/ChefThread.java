package com.kodewala.inc3;

public class ChefThread extends Thread 
{

	RestaurentOrder order;
	
	String[] dishes = { "Pizza", "Burger", "Pasta", "Dosa", "Sandwich" };

	public ChefThread(RestaurentOrder order)
	{
		super();
		this.order = order;
	}
	
	public void run()
	{
		 for (String dish : dishes)
		{
			try
			{
				order.chef(dish);
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
