package com.kodewala.reentrantlock.practice;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class BankAccount1
{
	private int balance = 1000;
	ReentrantLock reentrantLock = new ReentrantLock();

	public void withdraw(int amount) throws InterruptedException
	{
		boolean lockStatus = reentrantLock.tryLock(2, TimeUnit.SECONDS);
		System.out.println(Thread.currentThread().getName() + " Lock status: " + lockStatus);

		if (lockStatus)
		{
			try
			{
				System.out.println(Thread.currentThread().getName() + " Hold Count: " + reentrantLock.getHoldCount());
				if (balance >= amount)
				{
					System.out.println(Thread.currentThread().getName() + " is withdrawing " + amount);
					Thread.sleep(2900); // if you change this time and reduce it below try lock time then it both the
										// thread will get the lock
					balance = balance - amount;
					System.out.println(
							Thread.currentThread().getName() + " completed withdrawl. Remaining Balance: " + balance);
				} else
				{
					System.out.println("Insufficient Balance");
				}
			} finally
			{
				reentrantLock.unlock();
				System.out.println(Thread.currentThread().getName() + " released lock");
			}
		} else
		{
			System.out.println(Thread.currentThread().getName() + " could not acquire lock within time");
		}
	}

	public int getBalance()
	{
		return balance;
	}
}

class Customer1 extends Thread
{
	private final BankAccount1 account;

	public Customer1(BankAccount1 account, String name)
	{
		super(name);
		this.account = account;
	}

	@Override
	public void run()
	{
		try
		{
			account.withdraw(800);
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

public class ReentrantLockDemo1
{

	public static void main(String[] args) throws InterruptedException
	{
		BankAccount1 account1 = new BankAccount1();
		System.out.println("Initial Balance: " + account1.getBalance());

		Customer1 c1 = new Customer1(account1, "Shakir");
		Customer1 c2 = new Customer1(account1, "Faisal");

		c1.start();
		c2.start();

		c1.join();
		c2.join();

		System.out.println("Final Balance: " + account1.getBalance());

	}

}
