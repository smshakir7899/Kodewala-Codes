package com.kodewala.statement.returnstat;

public class ReturnEvenOdd
{

	public static void main(String[] args)
	{
		int input = Integer.parseInt(args[0]);
		String result = check(input);
		
		System.out.println(result);

	}
	
	static String check(int num)
	{
		if(num %2==0)
			return "Even";
		
		else
			return "Odd";
	}

}
