package com.example.app.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
 
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.app.Calculator;

/*
 * ========================= JUNIT NOTES =========================
 *
 * SOFTWARE DEVELOPMENT LIFE
 *
 * Requirement
 *      ↓
 * Development (Developer writes Java code)
 *      ↓
 * Product / Application
 *      ↓
 * Customer
 *
 * A software product may continue to evolve for 5–10 years or even longer.
 *
 * BUSINESS REQUIREMENTS KEEP CHANGING
 *
 * Example:
 * Order Service -> Place Order
 *
 * Initially, the Order Service works according to the current business
 * requirement. Later, the client may ask for new features such as:
 *
 * - Prime Member Discount
 * - Festival Offers
 * - Coupon Support
 * - New Payment Methods
 * - Delivery Improvements
 *
 * Therefore, developers continuously modify the existing code.
 *
 * Even though customers may not notice these changes, many internal
 * Java classes and methods are modified. 
 * (Just like heart surgery: from outside nothing seems different,
 * but internally many changes have been made.)
 *
 * WHY SHOULD DEVELOPERS TEST THEIR OWN CODE? 
 * Even though a separate QA/Testing team exists, developers should
 * verify that their own code works correctly before giving it to QA.
 *
 * Example:
 * A cook knows that someone will taste the food before serving it,
 * but the cook still checks whether the food is being prepared correctly.
 *
 * Similarly, developers should ensure that their code is working properly.
 *
 * WHAT IS UNIT TESTING? 
 * Unit Testing means testing one small unit of code independently.
 * Usually, one unit means one Java method.
 *
 * Example:
 * A projector has many individual functions:
 *
 * - Power ON
 * - Power OFF
 * - Zoom IN
 * - Zoom OUT
 * - Brightness
 * - HDMI
 * - Speaker
 *
 * Every function is tested separately.
 *
 * Likewise, every Java method should be tested separately.
 *
 * WHAT IS JUNIT?
 *
 * JUnit is a Java Testing Framework used to write and execute
 * Unit Test Cases.
 *
 * Example:
 *
 * public int addTwoNumbers(int a, int b)
 *
 * To verify this method, we write a separate test method that
 * calls addTwoNumbers() with different inputs and checks whether
 * it returns the expected result.
 *
 * Example Test Cases:
 *
 * 1 + 2   = 3
 * 0 + 2   = 2
 * 0 + 0   = 0
 * -12+23  = 11
 *
 * JUnit compares:
 *
 * Expected Result
 *        vs
 * Actual Result
 *
 * using Assertions such as:
 *
 * assertEquals(expected, actual);
 *
 * If both values are equal,
 *      Test PASSES.
 *
 * Otherwise,
 *      Test FAILS.
 *
 * MAIN PURPOSE OF JUNIT
 *
 * Whenever developers modify existing code, JUnit helps ensure
 * that the new changes have not broken the existing functionality.
 *
 * This gives developers confidence that their changes are safe
 * before the application is delivered to the Testing Team.
 * 
 * *
 * NOTE:
 * Developers write Unit Test Cases to verify that every method
 * behaves correctly before the application reaches the QA team.
 *
 * A successful JUnit test does not guarantee that the entire
 * application is bug-free, but it increases confidence that
 * individual units (methods) are working correctly.
*
 *
 * ===============================================================
 */



//Developer will write all the test cases to check the functionality
/*
 	To change the JUnit version,
	search "JUnit 4/5 Maven Dependency" on Google,
	copy the dependency from Maven Repository,
	and paste it into pom.xml.
*/
public class CalculatorTests
{
	// here you see we are repeating object calling line again and again which leads
	// to code duplicacy
	// in that scenario we have one method named as "@BeforeEach".
	
	// similarly we can use AfterAll, etc. (This is like SIB & IIB)

	
//	Calculator calculator;
//	@BeforeEach
//	public static void setup()
//	{
//		Calculator calculator = new Calculator();
//		System.out.println("CalculatorTests.setup().........................................");
//	}
	
	Calculator calculator;
	@BeforeEach
	public void setup()
	{
		calculator = new Calculator();
		System.out.println("Calculator Object Created..");
	}
	
	
	@BeforeAll
	public static void before()
	{
		System.out.println("Before All Test Cases");
	}

	@Test
	public void testAddTwoNumbers()
	{
//		Calculator calculator = new Calculator();
		int expected = 3;
		int actual = calculator.addTwoNumbers(1, 2); // based on input what method is returning

		assertEquals(expected, actual);// compare the expected value with actual

		// now after run as Junit test if it will show passed(or green) that means you
		// code is tested successfully and passed the test.
		// by doing this you can make your product bug free
	}

	@Test
	public void testAddTwoNumbersWithZero()
	{
		//Calculator calculator = new Calculator();
		// int expected = 3; if you do this it will show first is passed and 2nd is
		// failing
		int expected = 2;
		int actual = calculator.addTwoNumbers(0, 2); // based on input what method is returning

		assertEquals(expected, actual);
	}

	@Test
	public void testAddTwoNumbersWithBothZero()
	{
		//Calculator calculator = new Calculator();
		int expected = 0;
		int actual = calculator.addTwoNumbers(0, 0); // based on input what method is returning

		assertEquals(expected, actual);
	}

	@Test
	public void testAddTwoNumbersWithNegative()
	{
		//Calculator calculator = new Calculator();
		int expected = 11;
		int actual = calculator.addTwoNumbers(-12, 23); // based on input what method is returning

		assertEquals(expected, actual);
	} // if you modify something in Calculator file(e.g. use if(a>0, b>0)) then many
		// test will fail here
}
