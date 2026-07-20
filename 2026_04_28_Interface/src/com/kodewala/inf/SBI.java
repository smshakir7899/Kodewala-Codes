package com.kodewala.inf;

public class SBI implements IBanking  
{

	@Override
	public void pay()
	{
		System.out.println("SBI.pay()");
	}
	
	@Override
	public void settle()
	{
		System.out.println("SBI.settle()");
	}
	
	@Override
	public void addPay()
	{
		System.out.println("SBI.addPay()");
	}
	
	@Override
	public void modifyPay()
	{
		System.out.println("SBI.modifyPay()");
	}

	@Override
	public void doKYC()
	{
		System.out.println("SBI.doKYC()");
	}
}
