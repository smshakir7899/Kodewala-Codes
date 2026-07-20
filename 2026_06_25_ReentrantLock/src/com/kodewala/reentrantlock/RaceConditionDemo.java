package com.kodewala.reentrantlock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

import com.kodewala.reentrantlock.BankAccount;
import com.kodewala.reentrantlock.Customer;

class BankAccount
{
	private int balance = 2000;
	ReentrantLock reentrantLock = new ReentrantLock();

	public void withdraw(int amount) throws InterruptedException
	{
		System.out.println(Thread.currentThread().getName() + " some other logic....50 lines"); // slow down the
																								// performance

		boolean lockstatus = reentrantLock.tryLock(2000, TimeUnit.MILLISECONDS);
		System.out.println("BankAccount.withdraw() " + lockstatus + Thread.currentThread().getName());
		// Now we are using reentant lock

		// reentrantLock.tryLock(2000,TimeUnit.MILLISECONDS );
		// reentrantLock.lock(); //here developer are manually locking the object

		if (balance >= amount)
		{
			System.out.println(Thread.currentThread().getName() + " is withdrawing " + amount);
			try
			{
				Thread.sleep(100);
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			balance = balance - amount;
			System.out.println(Thread.currentThread().getName() + "completed withdrawal. Balance = " + balance);
			reentrantLock.unlock();
		} else
		{
			System.out.println(Thread.currentThread().getName() + " Insufficient Balance");
		}

//
		// reentrantLock.unlock();
//			reentrantLock.unlock(); // what if developer forgot to unlock  
		// it is also a dead lock condition
	}

	public int getBalance()
	{
		return balance;
	}
}

class Customer extends Thread
{
	private BankAccount account;

	public Customer(BankAccount account, String name)
	{
		super(name);
		this.account = account;
	}

	@Override
	public void run()
	{

		try
		{
			account.withdraw(1800);
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class RaceConditionDemo
{
	public static void main(String[] args) throws InterruptedException
	{
		BankAccount account = new BankAccount();
		System.out.println("Raunak's init balance: " + account.getBalance());

		Customer t1 = new Customer(account, " Gpay");
		Customer t2 = new Customer(account, " ATM");

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println("Final Balance: " + account.getBalance());
	}

}