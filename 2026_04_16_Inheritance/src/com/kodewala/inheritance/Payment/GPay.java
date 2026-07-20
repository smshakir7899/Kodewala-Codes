package com.kodewala.inheritance.Payment;

class GPay extends Payment
{

	public GPay(double amount)
	{
		super(amount);
	} 

	public void makePayment()
	{
		System.out.println("\nProcessing GPay Payment...");
		
		if (getAmount() <= 10000)
		{
			System.out.println("Payment Succesful");
			
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
