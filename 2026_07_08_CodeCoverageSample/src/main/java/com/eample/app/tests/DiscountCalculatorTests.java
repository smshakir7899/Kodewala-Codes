/* 
==========================
JUnit - Real-Time Industry Notes
==========================

• In interviews, companies usually do not ask basic questions like:
  - What is JUnit?
  - What is Unit Testing?
  They assume an experienced developer already knows these concepts.

• Instead, they ask practical questions such as:
  - What was your day-to-day activity?
  - How did you write unit tests?
  - How did you ensure your code changes did not break existing functionality?
  - What code coverage was maintained in your project?

Day-to-Day Activity of a Java Developer:

Requirement Analysis
        ↓
Understand the Requirement (most of the time is spent here)
        ↓
Develop the Code
        ↓
Write Unit Test Cases (JUnit)
        ↓
Run Unit Tests
        ↓
Check Code Coverage
        ↓
Commit the Code
        ↓
Move the Code to the Dev/QA Environment

Note:
A developer spends more time understanding the requirement than writing the code. 
Writing the correct code depends on understanding the requirement properly.

Real-Time Scenario: 
Suppose a developer worked on an Order Management System for five years and wrote around 5,000 lines of code along with unit test cases. 
Before leaving the company, all the unit tests were passing successfully (100% pass).

Now you join the project as a developer. 
Before introducing any new feature, first run all the existing unit test cases. 
If all the existing tests pass, then start implementing the new feature.

Example:

A new feature called "Open Box Delivery" is added. 
You write around 100 new lines of code, but accidentally forget to include the GST calculation.

After running the existing unit tests, 5 test cases fail. 
This indicates that the newly added code has affected the existing functionality (k/as regression). 
The developer should analyze the failed test cases, identify the issue, fix the code, and rerun the tests until all test cases pass again.

Why Code Coverage? 
A developer can create empty test methods like:

@Test
public void test1()
{
}

@Test
public void test2()
{
}

Although JUnit reports these tests as "Passed", they do not test any business logic. 
To prevent this, we use Code Coverage.

Code Coverage: 
Code Coverage measures how much of the application's source code (business logic) is executed while running the unit test cases.

It helps identify:
• Covered code
• Partially covered code
• Uncovered code

Higher code coverage generally indicates better testing of the application's business logic. 

Running Code Coverage in Eclipse: 
Instead of:
Run As → JUnit Test 
Use:
Coverage As → JUnit Test

Coverage Results:
• Green  → Code Covered
• Yellow → Partially Covered
• Red    → Code Not Covered

Interview Point: 
A common interview question is: 
"What code coverage was maintained in your project?"

A good sample answer is: 
"Our project maintained approximately 85% code coverage along with JUnit test cases to ensure the application's business logic was properly tested."*/


package com.eample.app.tests;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.example.app.DiscountCalculator;
import com.example.app.DiscountType;

public class DiscountCalculatorTests
{
	static DiscountCalculator calculator;

	@BeforeEach
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
	public void testPremiumDiscount()
	{
		assertEquals(20, calculator.getDiscount(DiscountType.PREMIUM));
	}

	@Test
	public void testVipDiscount()
	{
		assertEquals(30, calculator.getDiscount(DiscountType.VIP));
	}

	@Test
	public void testAllDiscounts()
	{
		assertEquals(5, calculator.getDiscount(DiscountType.NEW));
		assertEquals(10, calculator.getDiscount(DiscountType.REGULAR));
		assertEquals(20, calculator.getDiscount(DiscountType.PREMIUM));
		assertEquals(30, calculator.getDiscount(DiscountType.VIP));
	}
}
