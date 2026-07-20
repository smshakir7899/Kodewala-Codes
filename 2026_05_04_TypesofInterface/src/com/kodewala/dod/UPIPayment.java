package com.kodewala.dod;

public class UPIPayment implements IPayment, IRefund 
// This shows interface supports multiple inheritance
{
	@Override
	public void Pay() // child class(or user) can decide which method to be called
	{
		IPayment.super.Pay();
	}
}
