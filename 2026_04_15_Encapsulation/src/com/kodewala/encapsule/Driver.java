package com.kodewala.encapsule;

public class Driver
{

	public static void main(String[] args)
	{
		Account acc = new Account();
		//acc.balance = 2134343; //as we do not set the balance private so anybody can change it.
		
		acc.deposite(2000);
	}

}
