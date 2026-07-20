package com.kodewala.stream.operations.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FindDuplicates
{

	public static void main(String[] args)
	{
		List<Integer> nums = Arrays.asList(12, 5, 18, 12, 7, 25, 
										   18, 30, 4, 9, 25, 2);
		
		// Task: Find all duplicate numbers
		HashSet<Integer> set = new HashSet<Integer>();
		
		nums.stream()
			.filter(i -> !set.add(i))
			.forEach(i -> System.out.println(i));
	}

}
