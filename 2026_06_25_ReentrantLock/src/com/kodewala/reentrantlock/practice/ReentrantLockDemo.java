package com.kodewala.reentrantlock.practice;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/*
  synchronized keyword:
  - JVM automatically acquires and releases the object's monitor lock.
  - Developer does not need to manage locking manually.
 
  Limitation:
  - Less control over locking behavior.
  - A thread waiting for a synchronized lock cannot specify timeout.
 
  ReentrantLock:
  - Provides explicit/manual locking.
  - Developer must call lock() and unlock().
  - Offers additional features like tryLock(), timeout, fairness policy, etc.
 
  Important:
  - If a developer acquires a ReentrantLock and forgets to call unlock(),
    other threads may remain blocked indefinitely, causing thread starvation
    or a deadlock-like situation depending on the code structure.
 
  synchronized vs ReentrantLock:
 
  synchronized:
    - Lock management by JVM.
    - Simpler and less error-prone.
    - Automatically releases lock when method/block exits.
 
  ReentrantLock:
    - Lock management by developer.
    - More flexible and powerful.
    - Must release lock manually using unlock().
 
  Why wait() must be called from synchronized block/method?
 
  - wait() releases the monitor lock of the object and puts the thread
    into WAITING state.
  - If the current thread does not own the object's monitor lock,
    wait() cannot release it.
  - Therefore JVM throws IllegalMonitorStateException.
 
  In simple words:
    "Lock hi acquire nahi kiya to wait() release kya karega?"
 */

class BankAccount
{
	private int balance = 2000;

	private ReentrantLock reentrantLock = new ReentrantLock();

	public void withdraw(int amount) throws InterruptedException
	{
		System.out.println(Thread.currentThread().getName() + " some other logic....50 lines");

		boolean lockStatus = reentrantLock.tryLock(2000, TimeUnit.MILLISECONDS);

		System.out.println(Thread.currentThread().getName() + " Lock Status = " + lockStatus);

		if (lockStatus)
		{
			try
			{
				System.out.println(Thread.currentThread().getName() + " Hold Count = " + reentrantLock.getHoldCount());

				if (balance >= amount)
				{
					System.out.println(Thread.currentThread().getName() + " is withdrawing " + amount);

					Thread.sleep(3000);

					balance = balance - amount;

					System.out
							.println(Thread.currentThread().getName() + " completed withdrawal. Balance = " + balance);
				} else
				{
					System.out.println(Thread.currentThread().getName() + " Insufficient Balance");
				}
			} finally
			{
				 reentrantLock.unlock();

				System.out.println(Thread.currentThread().getName() + " released lock");
			}
		} else
		{
			System.out.println(Thread.currentThread().getName() + " could not acquire lock within 2 seconds");
		}
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
			e.printStackTrace();
		}
	}
}

public class ReentrantLockDemo
{
	public static void main(String[] args) throws InterruptedException
	{
		BankAccount account = new BankAccount();

		System.out.println("Initial Balance: " + account.getBalance());

		Customer t1 = new Customer(account, "Gpay");

		Customer t2 = new Customer(account, "ATM");

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println("Final Balance: " + account.getBalance());
	}
}