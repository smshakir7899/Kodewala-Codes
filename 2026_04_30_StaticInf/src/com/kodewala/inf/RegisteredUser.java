package com.kodewala.inf;

public class RegisteredUser implements IBankingSystem
{

	@Override
	public void deposit()
	{
		System.out.println("RegisteredUSer.deposit()");
	}

	@Override
	public void withdraw()
	{
		IBankingSystem.balanceCheck();
		System.out.println("RegisteredUSer.withdraw()");
	}

	@Override
	public void accOpening()
	{
		System.out.println("RegisteredUSer.accOpening()");
	}

	@Override
	public void eKYC()
	{
		System.out.println("RegisteredUSer.EKYC()");
		IBankingSystem.balanceCheck();
	}
}
