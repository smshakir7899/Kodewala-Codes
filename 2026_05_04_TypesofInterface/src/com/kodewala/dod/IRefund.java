package com.kodewala.dod;

public interface IRefund
{
	default void Pay()
	{
		System.out.println("IRefund.Pay()");
	}
}
