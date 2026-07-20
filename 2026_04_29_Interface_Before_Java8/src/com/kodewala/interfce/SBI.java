package com.kodewala.interfce;

public class SBI implements Banking
{

	@Override
	public void Pay()
	{
		System.out.println("SBI.Pay()");
	}

	@Override
	public void settle()
	{
		System.out.println("SBI.settle()");
	}

	@Override
	public void cancelTxn()
	{
		System.out.println("SBI.cancelTxn()");
	}

}
