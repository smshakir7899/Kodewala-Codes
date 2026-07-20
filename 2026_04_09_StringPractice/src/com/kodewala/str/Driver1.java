package com.kodewala.str;

public class Driver1
{

	public static void main(String[] args)
	{
		
		//CASE 1st
		String s1 = "Bengaluru"; // Creates "Bengaluru" object in SCP and s1 store its references.
		String s2 = "Bengaluru"; // it does not create any object
		// as first check into SCP that is same content present or not
		
		System.out.println(s1 == s2); // "==" --> it compares the object's addresses
		
		//CASE 2nd
		String s3 = "Bengaluru"; 
		String s4 = "Bengaluru"; // A new object is created in the SCP because Java is case-sensitive 
		
		System.out.println(s3 == s4);
		
		//CASE 3rd
		String s5 = "Bengaluru";
		String s6 = new String("Bengaluru"); // Heap object + SCP literal
		// here only one object created i.e. in heap as in SCP it founds that "Bengaluru" is already there
		
		System.out.println(s5 == s6); // it shows false bcz "==" only checks the addresses
		System.out.println(s5.equals(s6)); // it shows true as ".equals()--> checks the content not addresses"

	}

}
