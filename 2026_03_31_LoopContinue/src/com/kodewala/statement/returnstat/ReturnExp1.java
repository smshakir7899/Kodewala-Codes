package com.kodewala.statement.returnstat;

public class ReturnExp1
{

	public static void main(String args[])
	{
		int input= Integer.parseInt(args[0]);
		int result = square(input);
		
		System.out.println(result);
	}
	
	static int square(int num)
	{
		return num*num;
	}
	
}