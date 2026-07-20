package com.kodewala.stream.operations.practice;

import java.util.Arrays;
import java.util.List;

public class DivisibleBy5
{

	public static void main(String[] args)
	{
		// Task: Find the first number divisible by 5 after sorting in ascending order
		List<Integer> nums = Arrays.asList(12, 5, 18, 12, 7, 25, 
				   						   18, 30, 4, 9, 25, 2);
		
		System.out.println(nums.stream()
							   .sorted()
							   .filter(nu -> nu %5 == 0)
							   .findFirst()
							   .get());

	}

}
