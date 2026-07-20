package com.kodewala.stream.operations;

import java.util.Arrays;
import java.util.List;
  
public class Find2ndHighest
{

	public static void main(String[] args)
	{
		List<Integer> salary = Arrays.asList(16000,16890,18000,12345,9000,54676,9000);
		
		// Task: Find the 2nd Highest salary.
		// Approach --> remove duplicates --> sorting --> skip --> findFirst
		
		System.out.println("2nd Highest Salary: " + salary.stream().distinct().sorted((a,b) -> b-a).skip(1).findFirst().get());
		
		// Find 3rd Highest
		System.out.println("3rd Highest Salary: " + salary.stream().distinct().sorted((a,b) -> b - a).skip(2).findFirst().get());
		
		//Find 3rd Lowest
		System.out.println("3rd Lowest Salary: " + salary.stream().distinct().sorted().skip(2).findFirst().get());
		
		
	}

}
