package com.kodewala;

import java.util.Scanner;

class ScannerExampleNotes1
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter your age: ");
		int age =scan.nextInt();
		
		scan.nextLine();
		
		System.out.println("Enter your full name(as per aadhar): ");
		String fullName=scan.nextLine();
		
		System.out.println("Enter your Birth City: ");
		String birth=scan.nextLine();
		
		System.out.println("Enter your Weight(in kg): ");
		double weight=scan.nextDouble();
		
		System.out.println("\n-----Collected Data-----");
		System.out.println("Full Name: "+fullName);
		System.out.println("Age: "+age);
		System.out.println("Birth City: "+birth);
		System.out.println("Weight: "+weight);
		
		scan.close();
		
	}
}