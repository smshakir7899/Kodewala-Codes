package com.kodewala.practice;

class BankAccount1
{
	private int balance = 1000;

	public synchronized void withdraw(int amount) throws InterruptedException
	{
		System.out.println("Trying to withdraw " + amount);

		while (balance < amount)
		{
			System.out.println("Insufficient balance. Waiting for deposite....");
			wait();

		}

		balance -= amount;

		System.out.println("Withdrawn successful of " + amount);
		System.out.println("Remaining Balance: " + balance);

	}

	public synchronized void deposite(int amount)
	{

		balance += amount;

		System.out.println("Deposititon of  " + amount + " successfully");
		System.out.println("Updated Balance: " + balance);
		notify();
	}

	public int getBalance()
	{
		return balance;
	}
}

class WithdrawThread1 extends Thread
{
	private BankAccount1 account;

	public WithdrawThread1(BankAccount1 account, String name)
	{
		super(name);
		this.account = account;
	}

	@Override
	public void run()
	{
		try
		{
			account.withdraw(5000);

		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

class DepositeThread1 extends Thread
{
	BankAccount1 account;

	public DepositeThread1(BankAccount1 account, String name)
	{
		super(name);
		this.account = account;
	}

	@Override
	public void run()
	{
		account.deposite(10000);
	}

}

public class Driver
{

	public static void main(String[] args) throws InterruptedException
	{
		BankAccount1 account = new BankAccount1();
		System.out.println("Initial Balance: " + account.getBalance());
		WithdrawThread1 c1 = new WithdrawThread1(account, "Sayyed");
		DepositeThread1 c2 = new DepositeThread1(account, "Shakir");

		c1.start();
		Thread.sleep(3000);
		c2.start();

		c1.join();
		c2.join();
	}

}
