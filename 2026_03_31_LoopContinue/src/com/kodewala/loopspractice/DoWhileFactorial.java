package com.kodewala.loopspractice;

public class DoWhileFactorial
{

	public static void main(String[] args)
	{
		int i=1;
		int fact=1;
		int factValue = Integer.parseInt(args[0]); 
		
		do
		{
			fact=fact*i;
			i++;
		} while (i<=factValue);

		System.out.println("Factorial: "+fact);
	}

}
