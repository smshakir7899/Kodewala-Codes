package com.kodewala.multipleinheritance;

class Account
{
	public void openAccount(String someDetails)
	{
		System.out.println("Account.openAccount()");

	}
}

class SavingAccount extends Account
{
	public void openAccount(String someDetails)
	{
		System.out.println("SavingAccount.openAccount()");
	}
}

class CurrentAccount extends Account
{
	public void openAccount(String someDetails)
	{
		System.out.println("CurrentAccount.openAccount()");
	}
}

//class HybridAccount extends CurrentAccount,SavingAccount....you cannot do like this as Multiple Inheritance is unsupported in JAVA
class HybridAccount extends CurrentAccount
{
	public void openAccount(String someDetails)
	{
		System.out.println("HybridAccount.openAccount()");
	}
}

public class Driver
{

	public static void main(String[] args)
	{

		HybridAccount hc = new HybridAccount();
		hc.openAccount("Sakir");

	}

}
