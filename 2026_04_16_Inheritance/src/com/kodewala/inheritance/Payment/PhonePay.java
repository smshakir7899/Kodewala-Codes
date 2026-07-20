package com.kodewala.inheritance.Payment;

class PhonePay extends Payment
{

	public PhonePay(double amount)
	{
		super(amount);
 	}
	
	public void makePayment()
	{
		System.out.println("Processing PhonePe Payment...");
		
		if (getAmount() <= 10000)
		{
			System.out.println("Payment Successful");
			
			Bank bank = new Bank();
			bank.connectToBank();
			
			SmsService sms = new SmsService();
			sms.sendSms();
		} else
		{
			System.out.println("Payment Failed: Limit Exceeded");
		}
	}
	
}
