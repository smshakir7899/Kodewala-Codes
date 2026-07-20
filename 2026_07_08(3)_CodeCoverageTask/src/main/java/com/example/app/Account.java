package com.example.app;

public class Account
{
	String accountNo;
	String bankName;
	double balance;

	public Account(String accountNo, String bankName, double balance)
	{
		super();
		this.accountNo = accountNo;
		this.bankName = bankName;
		this.balance = balance;
	}
	
	public String getAccountNumber()
	{
		return accountNo;
	}
	
	public String getBankName()
	{
		return bankName;
	}

	public double getBalance()
	{
		return balance;
	}

	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	
	 

}
