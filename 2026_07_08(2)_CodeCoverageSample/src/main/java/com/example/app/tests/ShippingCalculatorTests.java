package com.example.app.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.example.app.ShippingCalculator;
import com.example.app.ShippingType;

public class ShippingCalculatorTests
{
	static ShippingCalculator calculator;

	@BeforeAll
	public static void beforeAll()
	{
		calculator = new ShippingCalculator();
	}

	@Test
	public void standardTypeTest()
	{
		assertEquals(50, calculator.getShippingCharge(ShippingType.STANDARD));
	}

	@Test
	public void sameDayTypeTest()
	{
		assertEquals(200, calculator.getShippingCharge(ShippingType.SAME_DAY));
	}

	@Test
	public void expressTypeTest()
	{
		assertEquals(100, calculator.getShippingCharge(ShippingType.EXPRESS));
	}

	@Test
	public void internationalTypeTest()
	{
//		int expected = 500;
//		int actual = calculator.getShippingCharge(ShippingType.INTERNATIONAL);
//		assertEquals(expected, actual);
		// Instead of this you can directly use like this assertEquals(expected, actual); 
		assertEquals(500, calculator.getShippingCharge(ShippingType.INTERNATIONAL));
	}

	@Test
	public void testAll()
	{
		assertEquals(50, calculator.getShippingCharge(ShippingType.STANDARD));
		assertEquals(200, calculator.getShippingCharge(ShippingType.SAME_DAY));
		assertEquals(100, calculator.getShippingCharge(ShippingType.EXPRESS));
		assertEquals(500, calculator.getShippingCharge(ShippingType.INTERNATIONAL));

	}
}
