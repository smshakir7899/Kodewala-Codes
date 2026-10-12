package com.kodewala.str;

public class StringPractice
{
	public static void main(String[] args)
	{
		
		String s1 = "Hello";
//		String s2 = s1;
		
		String s2 = new String("Hello");
		s2=s2.intern();
		
		System.out.println(s1==s2);
		
		
		
		String s3="Shakir";

		String reversed = new StringBuilder("Irfan").reverse().toString();
		System.out.println(reversed);
		
		
	}
	
	
}