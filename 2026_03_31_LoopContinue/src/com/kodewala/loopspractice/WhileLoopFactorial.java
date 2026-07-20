package com.kodewala.loopspractice;

public class WhileLoopFactorial
{

	public static void main(String[] args)
	{
		int i=1;
		int fact = 1;
		int factValue = Integer.parseInt(args[0]); 
		
		while (i<=factValue)
		{
			fact = fact *i;
			i++;
		}

		System.out.println("Factorial: "+fact);
	}

}
