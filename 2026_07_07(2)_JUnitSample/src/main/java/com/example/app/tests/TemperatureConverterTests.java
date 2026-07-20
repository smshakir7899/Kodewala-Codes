package com.example.app.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.app.TemperatureConverter;

public class TemperatureConverterTests
{

	static TemperatureConverter converter;

	@BeforeEach
	public void setup()
	{
		System.out.println("Creating Temprature Converter object");
		converter = new TemperatureConverter();
	}

	@BeforeAll
	public static void before()
	{
		System.out.println("========== Starting Temperature Converter Tests ==========");
	}

	@Test
	public void celsiusToFahrenheitTests()
	{

		int expected = 212;
		int actual = converter.celsiusToFahrenheit(100);

		assertEquals(expected, actual);
	}

	@Test
	public void celsiusToFahrenheitTestsWithZero()
	{

		int expected = 32;
		int actual = converter.celsiusToFahrenheit(0);

		assertEquals(expected, actual);
	}

	@Test
	public void celsiusToFahrenheitTestsWithNegative()
	{

		int expected = -40;
		int actual = converter.celsiusToFahrenheit(-40);

		assertEquals(expected, actual);
	}

	@Test
	public void celsiusToFahrenheitTests1()
	{

		int expected = 98;
		int actual = converter.celsiusToFahrenheit(37);

		assertEquals(expected, actual);
	}

//	@Test
//	public void celsiusToFahrenheitTests1()
//	{   
//		int expected = 100;
//		int actual =   converter.celsiusToFahrenheit(200);
//		
//		assertEquals(expected, actual);
//	}

	@AfterEach
	public void after()
	{
		System.out.println("Cleaning Resources......");
	}

	
	@AfterAll
	public static void endSetup()
	{
		System.out.println(" =================== All Tests Finished ================== ");
	}
}
