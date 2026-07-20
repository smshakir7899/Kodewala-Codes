package com.kodewala;

import java.util.Scanner;

public class ArrayUsingScanner
{

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		String[] employee = new String[5];
		
		employee[0] = "Shakir";
		employee[1] = "Faisal";
		employee[2] = "Zahur";
		employee[3] = "Nasir";
		employee[4] = "Rehmat";
		
		System.out.println("Enter Employee Name to Search: ");
		String searchName = sc.nextLine();
		boolean found = false;
		
		for (int i = 0; i < employee.length; i++)
		{
			if (employee[i].equalsIgnoreCase(searchName))
			{
				System.out.println("Employee found: "+employee[i]);
				found = true;
				break;
			}
		}
		
		if (!found)
		{
			System.out.println("Employee with name "+searchName+" not found.");
		}
		sc.close();

	}

}
