package com.kodewala.inf;

public class LowerCase
{

	public static void main(String[] args)
	{
		LowerCaseGenerator caseGenerator = (char a) -> System.out.println(Character.toLowerCase(a));
		caseGenerator.sum('T');
	}

}
