package com.kodewala.encapsule;


class BankAccount
{
	private double balance; // Private data member
	
	public BankAccount(double balance) // constructor to set initial balance
			{
				this.balance = balance;
			}

	public double getBalance() // getter method to view balance(read only access)
	{
		return balance;
	}

	public void deposit(double amount) // method to deposit money 
	{
		if (amount > 0)
		{
			balance += amount;
			System.out.println("Deposited: "+amount);
		} else
		{
			System.out.println("Invalid Amount!");
		}
		
	}
	
	public void withdraw(double amount) // method to withdraw money with security check
	{
		if (amount > 0 && amount <= balance)
		{
			balance -= amount;
			System.out.println("Withdrawn Amount: "+amount);
		} else
		{
			System.out.println("Insufficient fund or invalid amount!");
		}
	}
	
}
class Example
{

	public static void main(String[] args)
	{
		BankAccount obj = new BankAccount(1000);
		obj.deposit(200);
		obj.withdraw(800);
		System.out.println("Final Balance: "+obj.getBalance());
	}

}
