package com.kodewala.loops;

public class DebugExample
{

	public static void main(String[] args)
	{

		int total = 0;

		for (int i = 1; i <= 5; i++)
		{

			total = total + i;

			System.out.println("i = " + i);
			System.out.println("total = " + total);
		}

		System.out.println("Final Total = " + total);
	}
}