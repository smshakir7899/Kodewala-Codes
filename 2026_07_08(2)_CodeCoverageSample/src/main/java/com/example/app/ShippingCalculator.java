package com.example.app;

public class ShippingCalculator
{
	public int getShippingCharge(ShippingType type)
	{
		switch (type) {
		case STANDARD:
			return 50;

		case EXPRESS:
			return 100;

		case SAME_DAY:
			return 200;

		case INTERNATIONAL:
			return 500;
		}
		return 0;
	}
}
