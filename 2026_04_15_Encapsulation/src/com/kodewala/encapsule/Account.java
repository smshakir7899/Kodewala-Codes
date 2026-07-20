package com.kodewala.encapsule;

public class Account
{
	// double balance = 1000;  --> as of now it is not private so any class can change or modify it.
	// you can see in driver class.
	
	private double balance = 1000; // now we make it private

	//Getter
	public double getBalance()
	{
		return balance;
	}

	//Setter
	public void deposite(double amount) 
	{
		if (amount > 0)
		{
			System.out.println("Deposited Amount: " + amount);
			balance = balance + amount;
			System.out.println("Updated Balance: " + balance);
		} else
		{
			System.out.println("Invalid amount..!");
		}
		
	}
	
}
