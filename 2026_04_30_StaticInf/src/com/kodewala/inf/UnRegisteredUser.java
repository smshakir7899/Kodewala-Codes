package com.kodewala.inf;

public class UnRegisteredUser implements IBankingSystem
{

	@Override
	public void deposit()
	{
		System.out.println("UnRegisteredUser.deposit()");
		IBankingSystem.balanceCheck();
	}

	@Override
	public void withdraw()
	{
		System.out.println("UnRegisteredUser.withdraw()");
	}

	@Override
	public void accOpening()
	{
		System.out.println("UnRegisteredUser.accOpening()");
	}

	@Override
	public void eKYC()
	{
		System.out.println("UnRegisteredUser.eKYC()");
	}

}
