package com.kodewala.method.override;

class PaymentSystem
{
	void pay()
	{
		System.out.println("Doing Payment");
	}
}

 
 

public class Driver1
{

	public static void main(String[] args)
	{
		
		PaymentSystem system = new PaymentSystem();
		system.pay();
		
		
		PhonePe pe = new PhonePe();
		pe.pay();
		
		 
		GPay gPay = new GPay();
		gPay.pay();

	}

}
