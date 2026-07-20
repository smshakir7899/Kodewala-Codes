package com.kodewala.inf.practice;

public class Netflix implements OTTPlateform
{
	@Override
	public void signUp()
	{
		System.out.println("Netflix.signUp()");
	}

	@Override
	public void login()
	{
		System.out.println("Netflix.login()");
	}

	@Override
	public void subscribe()
	{
		System.out.println("Netflix.subscribe()");
	}

	@Override
	public void typeOfSubscription()
	{
		System.out.println("Netflix.typeOfSubscription()");
	}

	@Override
	public void cancelSubscription()
	{
		System.out.println("Netflix.cancelSubscription()");
	}

	@Override
	public void deleteAccount()
	{
		System.out.println("Netflix.deleteAccount()");
	}
}
