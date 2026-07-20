package com.kodewala.method.override;

class PhonePe extends PaymentSystem
{
	@Override
	void pay()
	{
		System.out.println("Doing PhonePe Payment");
	}
	
}
