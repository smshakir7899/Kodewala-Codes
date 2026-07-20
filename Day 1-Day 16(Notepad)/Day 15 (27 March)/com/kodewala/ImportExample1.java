package com.kodewala;

import java.util.Scanner;

class ImportExample1
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Hello, Please enter your name:");
		String name=scan.next();
		System.out.println("Welcome "+name);
		scan.close();
	}
}