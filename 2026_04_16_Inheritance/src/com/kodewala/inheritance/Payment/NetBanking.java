package com.kodewala.inheritance.Payment;

class NetBanking extends Payment
{

	public NetBanking(double amount)
	{
		super(amount);
	}

	void doPayment()
	{
		System.out.println("\nProcessing NetBanking Payment...");
		
		if (getAmount() <= 50000)
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
