package com.kodewala.object3;


class Bank 
{
	Bank ()
	{
		super();
		System.out.println("Bank Constructor");
	}
	
}

class Account extends Bank
{
	Account()
	{
		this("Savings");
		System.out.println("Default Account");
	}
	
	Account(String type)
	{
		super();
		System.out.println("Account Type: "+type);
	}
	
	
}


public class Driver
{

	public static void main(String[] args)
	{
		
		Account acc = new Account(); 
	}

}
