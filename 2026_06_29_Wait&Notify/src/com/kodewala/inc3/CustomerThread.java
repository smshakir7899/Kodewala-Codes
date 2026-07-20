package com.kodewala.inc3;

public class CustomerThread extends Thread 
{
	RestaurentOrder order;

	public CustomerThread(RestaurentOrder order)
	{
		super();
		this.order = order;
	}
	
	public void run()
	{
		for (int i = 0; i < 5; i++)
		{
			try
			{
				order.customer();
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
