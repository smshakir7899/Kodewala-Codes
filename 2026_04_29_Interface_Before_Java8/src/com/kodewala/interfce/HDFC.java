package com.kodewala.interfce;

public class HDFC implements Banking
{

	@Override
	public void Pay()
	{
		System.out.println("HDFC.Pay()");
	}

	@Override
	public void settle()
	{
		System.out.println("HDFC.settle()");
	}

	@Override
	public void cancelTxn()
	{
		System.out.println("HDFC.cancelTxn()");
	}

}
