package com.kodewala;

import java.util.Scanner;

public class ArrayUsingScanner1
{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		String[] employee = new String[5];
		
		for (int i = 0; i < employee.length; i++)
		{
			System.out.println("Enter Employee Name "+(i+1)+" : ");
			employee[i] = sc.nextLine();
		}
		
		System.out.println("\nStored Employee Names:");
		
		for (int i = 0; i < employee.length; i++)
		{
			System.out.println(employee[i]);
		}
		
		sc.close();
		
		
		
	}
}