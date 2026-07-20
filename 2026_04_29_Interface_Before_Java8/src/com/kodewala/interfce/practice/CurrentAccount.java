package com.kodewala.interfce.practice;

public class CurrentAccount implements BankAccount
{
	private double balance;

	public CurrentAccount(double amount)
	{
		super();
		this.balance = balance;
	}

	@Override
	public void deposit(double amount)
	{
		balance += amount;
		System.out.println("Deposited " + amount + " in Current Account. New Balance: " + balance);
	}

	@Override
	public void withdraw(double amount)
	{
		balance -= amount;
		System.out.println("Withdrawn " + amount + " from Current Account. New Balance: " + balance);
	}

	@Override
	public double checkBalance()
	{
		return balance;
	}

}
