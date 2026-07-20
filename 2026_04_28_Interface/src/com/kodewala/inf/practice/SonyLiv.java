package com.kodewala.inf.practice;

public class SonyLiv implements OTTPlateform
{

	@Override
	public void signUp()
	{
		System.out.println("SonyLiv.signUp()");
	}

	@Override
	public void login()
	{
		System.out.println("SonyLiv.login()");
	}

	@Override
	public void subscribe()
	{
		System.out.println("SonyLiv.subscribe()");
	}

	@Override
	public void typeOfSubscription()
	{
		System.out.println("SonyLiv.typeOfSubscription()");
	}

	@Override
	public void cancelSubscription()
	{
		System.out.println("SonyLiv.cancelSubscription()");
	}

	@Override
	public void deleteAccount()
	{
		System.out.println("SonyLiv.deleteAccount()");
	}

}
