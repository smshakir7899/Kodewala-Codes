package com.kodewala.sync;

class BankAccount
{
	private int balance = 2000;

	public void withdraw(int amount) // synchronized method --> only one thread will be execute the method
	{
		System.out.println(Thread.currentThread().getName() + " some other logic....50 lines"); // slow down the performance
		
		//so we want that some code will run before synchronization.....which improves performance  																					// performance
		// now we are converting synchronized method to synchronized block.
		// prefer synchronized block over synchronized method when only a small portion of method needs synchronization.  
		
		/*
		 * Interview Answer: 
		 * A synchronized method locks the entire method, whereas a
		 * synchronized block locks only a specific section of code. 
		 * Synchronized blocks provide better control and often better performance 
		 * because the lock is held for a shorter duration.
		 */
		
		synchronized (this) // if the method is static use "BankAccount.class" instead of "this"
		{

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
			} else
			{
				System.out.println(Thread.currentThread().getName() + " Insufficient Balance");
			}
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

		account.withdraw(1800);
	}
}

public class RaceConditionDemo
{
	public static void main(String[] args) throws InterruptedException
	{
		BankAccount account = new BankAccount();
		System.out.println("Raunak's init balance: " + account.getBalance());

		Customer t1 = new Customer(account, "Raunak is using Gpay");
		Customer t2 = new Customer(account, "Raunak is using ATM");

		t1.start();
		t2.start();

 		t1.join();
		t2.join();
		
		System.out.println("Final Balance: " + account.getBalance());
	}

}