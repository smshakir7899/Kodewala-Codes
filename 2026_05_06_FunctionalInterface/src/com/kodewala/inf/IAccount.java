package com.kodewala.inf;

public interface IAccount
{
	void pay(); // Now it is functional interface (as only one abstract method are there)
}

//Q) is the child interface i.e. IFunction is functional or not
// Answer: till no abstract method are defined in IFunction it is Functional 
// as it is implementing one abstract method from parent
// you can check by using this annotation i.e.  @FunctionalInterface
 
interface IFunction extends IAccount
{
	default void refund()
	{
		 // still it is a Functional Interface as only one abstract method
	}
	void settle(); // Now it is not Functional Interface as it has 2 abstract method one this & one
					// from parent
}