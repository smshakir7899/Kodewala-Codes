package com.kodewala.interfce.practice;

public interface BankAccount
{
	public static final double MIN_BALANCE = 1000.00;
	
	// Abstract Method
	void deposit(double amount);
	void withdraw(double amount);
	double checkBalance();
}
