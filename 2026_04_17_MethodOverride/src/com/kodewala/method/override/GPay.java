package com.kodewala.method.override;

 class GPay extends PaymentSystem
{
	@Override
	void pay()
	{
		System.out.println("Doing GPay Payment");
	}

}
