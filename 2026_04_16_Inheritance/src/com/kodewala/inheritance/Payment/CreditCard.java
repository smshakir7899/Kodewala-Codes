package com.kodewala.inheritance.Payment;

class CreditCard extends Payment
{

	public CreditCard(double amount)
	{
		super(amount);
	}
	
	void makePayment()
	{
		System.out.println("\nProcessing Credit Card Payment...");
		
		if (getAmount() <= 20000)
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
