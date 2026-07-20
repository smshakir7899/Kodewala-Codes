package com.kodewala.inf;

public class HDFC implements IBanking
{

	@Override
	public void pay()
	{
		System.out.println("HDFC.pay()");
	}

	@Override
	public void settle()
	{
	System.out.println("HDFC.settle()");
	}

	@Override
	public void addPay()
	{
		System.out.println("HDFC.addPay()");
	}

	@Override
	public void modifyPay()
	{
	System.out.println("HDFC.modifyPay()");
	}

	@Override
	public void doKYC()
	{
		System.out.println("HDFC.doKYC()");
	}

}
