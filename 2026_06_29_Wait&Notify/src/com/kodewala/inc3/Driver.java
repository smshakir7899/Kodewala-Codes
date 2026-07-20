package com.kodewala.inc3;

public class Driver
{

	public static void main(String[] args)
	{
		RestaurentOrder order = new RestaurentOrder();
		
		ChefThread ch = new ChefThread(order);
		ch.setName("Chef");
		ch.start();
		
		CustomerThread cu = new CustomerThread(order);
		cu.setName("Customer");
		cu.start();
	}

}
