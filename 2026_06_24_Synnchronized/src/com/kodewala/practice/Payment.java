package com.kodewala.practice;

class BankAccount
{
	private static int balance = 2000;

	public void withdraw(int amount)
	{
		synchronized (this)
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
				System.out.println(
						Thread.currentThread().getName() + " completed withdrawl. Remaining Balance: " + balance);
			} else
			{
				System.out.println(Thread.currentThread().getName() + " Insufficient balance");
			}
		}
	}

	public static void deposite(int amount)
	{
		synchronized (BankAccount.class)
		{

			System.out.println(Thread.currentThread().getName() + " is depositing " + amount);
			balance = balance + amount;
			System.out.println(Thread.currentThread().getName() + " completed deposite. Updated Balance: " + balance);

		}
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
		account.withdraw(1800);
	}
}

class DepositeThread extends Thread
{
	private BankAccount account;

	public DepositeThread(BankAccount account, String name)
	{
		super(name);
		this.account = account;
	}

	@Override
	public void run()
	{
		BankAccount.deposite(2500);
	}

}

public class Payment
{

	public static void main(String[] args) throws InterruptedException
	{
		BankAccount account = new BankAccount();
		System.out.println("Shakir's initial balance: " + account.getBalance());

		WithdrawThread c1 = new WithdrawThread(account, "Withdraw");
		DepositeThread c2 = new DepositeThread(account, "Deposite");

		c1.setName("GPay");
		c2.setName("ATM");
		c1.start();
		c2.start();

		c1.join();
		c2.join();

		System.out.println("Shakir's final balance: " + account.getBalance());

	}

}
