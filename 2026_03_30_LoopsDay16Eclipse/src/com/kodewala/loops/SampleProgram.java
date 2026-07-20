package com.kodewala.loops;

public class SampleProgram {

	public static void main(String[] args) {
		System.out.println("Payment.Main......");
		SampleProgram sam=new SampleProgram();
		sam.doPayment();
		
	}
	
	public void doPayment()
	{
		System.out.println("Payment Processing--STARTED");
		
		PaymentProcessor pay = new PaymentProcessor();
		pay.processPayment();
		System.out.println("Payment Processing--ENDED");
	}

}

class PaymentProcessor
{
	public void processPayment ()
	{
		System.out.println("Payment Succesful-STARTED");
		System.out.println("Payment Succesful--ENDED");
	}
}
