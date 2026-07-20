package com.kodewala;
//As a beginner majority of the class which are required are saved in java.lang
//and whenever you are writing code compiler implicitly importing that files 
import java.util.Scanner; //Importing class or data which are not stored in java.lang.

public class ScannerExampleNotes
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);//Creating a Scanner object for input
		//Using nextInt() to read an Integer
		System.out.println("Please Enter your age: "); //Prompt user to enter their age
		int age = scan.nextInt();//Read an integer input
		
		// Clear the buffer
		scan.nextLine();// Consume the leftover newline character after nextInt()
		
		// Using nextLine() to read a full line of text
		System.out.print("Enter your full name: "); // Prompt user to enter their full name 
		String fullName =scan.nextLine(); // Read the entire line of text es input

		// Using next() to read a single word
		System.out.print("Enter your favorite color: "); // Prompt user to enter their favorite color 
		String color = scan.next(); // Read a single word as input

		// Using nextDouble() to read a decimal number
		System.out.print("Enter your weight in kilograms: "); // Prompt user to enter their weight 
		double weight =scan.nextDouble(); // Read a double value as Input

		System.out.println("\n--- Collected Input---"); 
		System.out.println("Age:"+age); // Display the age
		System.out.println("Full Name: "+fullName); // Display the full name
		System.out.println("Favorite Color: "+color); // Display the favorite color 
		System.out.println("Weight: "+weight+ " kg"); // Display the weight in kilograms

		scan.close(); // Close the Scanner object to release resources
	}
}