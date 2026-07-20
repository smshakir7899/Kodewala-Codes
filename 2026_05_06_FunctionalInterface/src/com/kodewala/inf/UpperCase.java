package com.kodewala.inf;

public class UpperCase
{

	public static void main(String[] args)
	{
		UpperClassGenerator generator = (char a) ->
				{
			System.out.println("Upper Case: " + Character.toUpperCase(a));
				};
				
				generator.sum('s');
	}

}
