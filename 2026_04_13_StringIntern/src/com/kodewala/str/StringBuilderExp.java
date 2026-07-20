package com.kodewala.str;

public class StringBuilderExp
{

	public static void main(String[] args)
	{
		String s1 = "Hello";
		String s2 = s1.concat(" World");
		
		/*
		 * here we cannot modify or change the so you have to create new object i.e. s2  
		 * 
		 * For e.g
		 * Hi Shakir, 
		 * Thank your for placing an order for item (Iphone17) and your order is
		 * currently being packed. You will be received the order by 10th July
		 * 
		 * Thanks 
		 * Amazon
		 */
		// This message will be different for different users so for every new message you will create new object.
		// 100k object for 100k message 
		// If you use StringBuilder only 1/2 object will be created.

		// Using StringBuilder we can modify this existing s1 without creating new
		// object(i.e. s2).

		StringBuilder sb = new StringBuilder("Kodewala");
		sb.append(" Academy");
		System.out.println(sb);

	}

}
