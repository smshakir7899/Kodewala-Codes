package com.kodewala.statement.returnstat;

public class ReturnSum
{

	public static void main(String[] args)
	{
		int firstNum = Integer.parseInt(args[0]);
		int secondNum = Integer.parseInt(args[1]);
		
		int result =add(firstNum,secondNum);
		System.out.println(result);
	}
	
	static int add(int firstNum, int secondNum)
	{
		return firstNum+secondNum;
	}

}
