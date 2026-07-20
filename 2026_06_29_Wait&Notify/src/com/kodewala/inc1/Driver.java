package com.kodewala.inc1;

class BankAccount
{
	private int balance = 1000;

	public synchronized void withdraw(int amount) throws InterruptedException
	{
		System.out.println(Thread.currentThread().getName() + " is trying to withdraw: " + amount);
		while (balance < amount)
		{
			System.out.println("Insufficient balance. Waiting for deposite...");
			wait();
			System.out.println(Thread.currentThread().getName() + " resumed");
		}

		balance = balance - amount;

		System.out.println("Withdran successful of " + amount);
		System.out.println("Remaining balance: " + balance);
	}

	public synchronized void deposite(int amount)
	{
		balance = balance + amount;
		System.out.println(Thread.currentThread().getName() + " deposited " + amount + " successfully");
		notify();
	}

	public int getBalance()
	{
		return balance;
	}
}

class WithdrawThread extends Thread
{
	private BankAccount account;

	public WithdrawThread(BankAccount account, String name)
	{
		super(name);
		this.account = account;
	}

	@Override
	public void run()
	{
		try
		{
			account.withdraw(1500);
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class DepositeThread extends Thread
{
	BankAccount account;

	public DepositeThread(BankAccount account, String name)
	{
		super(name);
		this.account = account;
	}

	@Override
	public void run()
	{
		account.deposite(2000);
	}

}

public class Driver
{

	public static void main(String[] args) throws InterruptedException
	{
		BankAccount account = new BankAccount();

		System.out.println("Initial Balance: " + account.getBalance());

		WithdrawThread w1 = new WithdrawThread(account, "Durga");
		w1.start();
		Thread.sleep(2000);
		DepositeThread d1 = new DepositeThread(account, "Ritesh");
		d1.start();

	}

}
