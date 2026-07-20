package com.kodewala.loopspractice;

public class WhileLoopExp1
{

	public static void main(String[] args)
	{
		int i=1;
		
		// for(initialization; condition; update)
		/**
		 * while (condition)
		{
			code
		} 
		*/
		while (i<=10) // condition: i should be less than or equal to 10(It should be checked before execution)
		{
			System.out.println(i);
			i++; //Increment in i after each iteration
		}

	}

}
