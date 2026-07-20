package com.kodewala;

// if you make payment method and class abstract then you are forcing child class to implement it 

abstract class PaymentSystem // (Abstract) + (Non-Abstract - Method with body)
{
	public abstract void pay(); // What..?

	public abstract void doKYC(); // Abstract Method

	public void stopCheque() // Non Abstract Method
	{
		System.out.println("PaymentSystem.stopCheque()");
	}
	
	PaymentSystem()
	{
		super();
	}
}

class HDFC extends PaymentSystem
{
	@Override
	public void pay()
	{
		System.out.println("HDFC.pay()"); // How..?
	}

	@Override
	public void doKYC()
	{
		System.out.println("HDFC.doKYC()");

	}

}

public class Driver
{

	public static void main(String[] args)
	{
		// PaymentSystem paymentSystem = new PaymentSystem();
		// --> you cannot create the object of abstract class
		
		// but constructor is allowed and that constructor will be executed while
		// executing object of child class

		HDFC hdfc = new HDFC();
		hdfc.pay();
		hdfc.doKYC();
	}

}
