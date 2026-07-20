package com.example.app.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.example.app.DiscountCalculator;
import com.example.app.DiscountType;

public class DiscountCalculatorTests
{
	static DiscountCalculator calculator;

//	@BeforeEach 
//	 public static void beforeAll()
//	 {
//		 calculator = new DiscountCalculator();
//	 }

	@Before 
	public void beforeAll()
	{
		calculator = new DiscountCalculator();
	}

	@Test
	public void newDiscountTest()
	{
		assertEquals(5, calculator.getDiscount(DiscountType.NEW));
	}

	@Test
	public void testRegularDiscount()
	{
		assertEquals(10, calculator.getDiscount(DiscountType.REGULAR));
	}

	@Test
	void testPremiumDiscount()
	{
		assertEquals(20, calculator.getDiscount(DiscountType.PREMIUM));
	}

	@Test
	void testVipDiscount()
	{
		assertEquals(30, calculator.getDiscount(DiscountType.VIP));
	}

	@Test
	void testAllDiscounts()
	{
		assertEquals(5, calculator.getDiscount(DiscountType.NEW));
		assertEquals(10, calculator.getDiscount(DiscountType.REGULAR));
		assertEquals(20, calculator.getDiscount(DiscountType.PREMIUM));
		assertEquals(30, calculator.getDiscount(DiscountType.VIP));
	}

}
