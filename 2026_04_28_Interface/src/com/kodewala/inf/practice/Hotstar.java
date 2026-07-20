package com.kodewala.inf.practice;

public class Hotstar implements OTTPlateform
{

	@Override
	public void signUp()
	{
		System.out.println("Hotstar.signUp()");
	}

	@Override
	public void login()
	{
		System.out.println("Hotstar.login()");
	}

	@Override
	public void subscribe()
	{
		System.out.println("Hotstar.subscribe()");
	}

	@Override
	public void typeOfSubscription()
	{
		System.out.println("Hotstar.typeOfSubscription()");
	}

	@Override
	public void cancelSubscription()
	{
		System.out.println("Hotstar.cancelSubscription()");
	}

	@Override
	public void deleteAccount()
	{
		System.out.println("Hotstar.deleteAccount()");
	}

}
