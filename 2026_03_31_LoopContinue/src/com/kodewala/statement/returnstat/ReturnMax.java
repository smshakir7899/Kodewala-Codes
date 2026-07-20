package com.kodewala.statement.returnstat;

public class ReturnMax
{

	public static void main(String[] args)
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		int result= max(a,b);
		
		System.out.println("Bigger Number: "+result);

	}
	
	static int max(int a, int b)
	{
		if(a>b)
			return a;
		
		else
			return b;
		
	}

}
