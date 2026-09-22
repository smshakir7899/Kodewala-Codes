package com.kodewala.str;

public class Intern
{

	public static void main(String[] args)
	{
		String s1 = "Kodewala"; // --> scp
		String s2 = " Academy"; // --> scp
		
		String s3= s1+s2; // --> Heap
		// runtime concatination
		
		//Intern is used to transfer object from Heap to SCP.
		
		String s4 = s3.intern(); // copied to scp
		
		String s5 = "Kodewala Academy"; // --> SCP
		
		System.out.println(s4 == s5); // --> true 

	}

}
