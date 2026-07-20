package com.kodewala.combination;

public class Calculator
{

	public static void main(String[] args)
	{
		int firstNum = Integer.parseInt(args[0]);
		int secondNum = Integer.parseInt(args[1]);
		int choice = Integer.parseInt(args[2]);
		
		
		switch (choice) {
		case 1:
		
			System.out.println("Addition: "+add(firstNum,secondNum));	
			break;

		case 2:
			
			System.out.println("Substraction: "+subs(firstNum,secondNum));	
			break;

		case 3:
			
			System.out.println("Multiplication: "+mul(firstNum,secondNum));	
			break;

		case 4:
			
			System.out.println("Division: "+div(firstNum,secondNum));	
			break;

			
		default:
			
			System.out.println("Invalid Choice");
			break;
		}
		
	}

		
		static int add(int a, int b)
		{
			return a+b;
		}
		
		
		static int subs(int a, int b)
		{
			return a-b;
		}
		
		
		static int mul(int a, int b)
		{
			return a*b;
		}
		
		
		static int div(int a, int b)
		{
			return a/b;
		}
		


}
