package com.kodewala.inheritance;

public class Account
{
	double balance;

	//Constructor
	public Account(double balance)
	{
		super();
		this.balance = balance;
	}
	
	//Method to show the balance
	public void showBalance()
	{
		System.out.println("Account Balance: " + balance);
	}
 
	
}
