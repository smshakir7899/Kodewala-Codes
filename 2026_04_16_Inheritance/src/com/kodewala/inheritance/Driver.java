package com.kodewala.inheritance;


// Child class inheritance Account using extends
class SavingAccount extends Account
{
	double interestRate; 

	// Constructor
	public SavingAccount(double balance, double interestRate)
	{
		super(balance); // calling parent class constructor
		this.interestRate = interestRate;
		
 	}
	
	// Method to calculate interest
	public void calculateInterest()
	{
		double interest = balance * interestRate/100;
		System.out.println("Interest Earned: " + interest);
	}
}
public class Driver
{

	// Main class to test Inheritance
	public static void main(String[] args)
	{
		SavingAccount sa = new SavingAccount(10000, 4); // Creating saving account object
		sa.showBalance(); // Inherited method from account class
		sa.calculateInterest(); // Method from savingAccount class
	}

}
