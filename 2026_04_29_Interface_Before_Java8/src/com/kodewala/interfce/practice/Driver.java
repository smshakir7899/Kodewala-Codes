package com.kodewala.interfce.practice;

public class Driver
{
	public static void main(String[] args)
	{
		BankAccount account = new SavingAccount(30000);
		account.deposit(12000);
		account.withdraw(38000);
		
		System.out.println("Current Balance: " + account.checkBalance());
		
		
		BankAccount account2 = new CurrentAccount(12000);
		System.out.println("Balance: " + account2.checkBalance());
	}
}
