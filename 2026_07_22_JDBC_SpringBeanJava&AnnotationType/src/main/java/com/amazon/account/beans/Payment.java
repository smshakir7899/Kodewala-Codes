package com.amazon.account.beans;

import org.springframework.stereotype.Component;

@Component // payment class beans become spring managed beans.
public class Payment
{
	public void showPayment()
	{
		System.out.println("Payment.showPayment().......");
	}

}
