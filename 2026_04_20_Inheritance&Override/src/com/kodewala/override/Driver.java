package com.kodewala.override;

class Payment // super class of UPI
{
	void doPayment()
	{
		System.out.println("Payment.doPayment()....");
	}
}


class UPI extends Payment
{
	@Override // check all the rules of override
	protected void doPayment()
	// changing the functionalities 
	// go and see the rules in screenshot
	{
		System.out.println("UPI.doPayment()....");
	}
	
}

// PRACTICE COVARIANTTTT
public class Driver
{

	public static void main(String[] args)
	{
		
	}

}
