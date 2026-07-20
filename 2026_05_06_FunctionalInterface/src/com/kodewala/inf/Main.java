package com.kodewala.inf;

class Main
{
	public static void main(String[] args)
	{
		ICalc calc = (i, j) -> i + j; // here we do not even have to mention the method name as it knows that the
										// interface is functional and it has only one method
		
		// this is k\as Lambda Function OR Lambda expression
		
		int sum = calc.doCalc(12, 23);

		System.out.println(sum);
	}
}