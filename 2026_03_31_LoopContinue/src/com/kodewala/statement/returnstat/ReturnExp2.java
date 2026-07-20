package com.kodewala.statement.returnstat;

public class ReturnExp2
{
	
	public static void main(String args[])
	{
		int input= Integer.parseInt(args[0]);
		int result = cube(input);
		
		System.out.println(result);
	}
	
	static int cube(int num)
	{
		return num*num*num;
	}
	
}
