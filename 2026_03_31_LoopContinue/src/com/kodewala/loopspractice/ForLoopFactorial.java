package com.kodewala.loopspractice;

public class ForLoopFactorial
{

	public static void main(String args[])
	{
		int fact=1;
		int factValue = Integer.parseInt(args[0]);
		
		for (int i = 1; i <= factValue; i++)
		{
			fact=fact*i;
		}
		
		System.out.println("Factorial: "+fact);
	}
}