package com.kodewala.interfce.practice;

public class SavingAccount implements BankAccount
{
	private double balance;
	
	public SavingAccount(double balance)
	{
		super();
		this.balance = balance;
	}

	@Override
	public void deposit(double amount)
	{
		balance += amount;
		System.out.println("Deposited " + amount + " in Savings Account. New Balance: " + balance);
	}

	@Override
	public void withdraw(double amount)
	{
	if (balance - amount >= MIN_BALANCE)
	{
		balance -= amount;
		System.out.println("Withdrawn " + amount + " from Saving Account. New Balance: " + balance);
	} else
		{
			System.out.println("Insufficient Balance");
		}	
	}

	@Override
	public double checkBalance()
	{
		return balance;
	}
	
}
