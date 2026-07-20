package com.kodewala.stream.operations.practice;

import java.util.Arrays;
import java.util.List;

public class SumOfUniqueOdd
{

	public static void main(String[] args)
	{
		List<Integer> nums = Arrays.asList(12, 5, 18, 12, 7, 25, 
										   18, 30, 4, 9, 25, 2);

		//Task: Find the sum of all unique odd numbers
		System.out.println(nums.stream()
							   .filter(nu -> nu % 2 != 0)
							   .distinct()
							   .mapToInt(i -> i.intValue())
							   .sum());

	}

}
