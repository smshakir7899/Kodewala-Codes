package com.kodewala.stream.operations.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintNum
{

	public static void main(String[] args)
	{
		List<Integer> nums = Arrays.asList(12,5,18,12,7,25,18,30,4,9,25,2);
		
		//Task: Print all numbers greater than 10 in descending order
		System.out.println(nums.stream()
							   .filter(nu -> nu>10)
							   .sorted((a,b)-> b-a)
							   .collect(Collectors.toList()));

	}

}
