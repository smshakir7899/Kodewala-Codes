package com.kodewala;

// Task: Develop a e-com Delivery system and make use of abstract class.
// Abstract method Non-Abstract method (providing default functionalities)

abstract class EcomDelivery
{
	public abstract void oneTimePassword();

	public abstract void deliverOrder();

	public void trackOrder()
	{
		System.out.println("EcomDelievery.trackOrder()");
	}

}

class XpressBees extends EcomDelivery
{
	@Override
	public void deliverOrder()
	{
		System.out.println("XpressBees.delieverOrder()");
	}

	@Override
	public void oneTimePassword()
	{
		System.out.println("XpressBees.oneTimePassword()");
	}

}

class Dtdc extends EcomDelivery
{
	@Override
	public void deliverOrder()
	{
		System.out.println("Dtdc.delieverOrder()");
	}

	@Override
	public void oneTimePassword()
	{
		System.out.println("Dtdc.oneTimePassword()");
	}

}

public class ECom
{

	public static void main(String[] args)
	{
		XpressBees bees = new XpressBees();
		bees.trackOrder();
		bees.oneTimePassword();
		bees.deliverOrder();

		Dtdc dtdc = new Dtdc();
		dtdc.trackOrder();
		dtdc.oneTimePassword();
		dtdc.deliverOrder();

	}

}
