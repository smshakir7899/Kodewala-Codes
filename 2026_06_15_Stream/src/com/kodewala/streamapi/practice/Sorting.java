package com.kodewala.streamapi.practice;

import java.util.Arrays;
import java.util.List;

public class Sorting
{

	public static void main(String[] args)
	{
		// Task: Flatten and sort
		List<List<Integer>> input= Arrays.asList(Arrays.asList(1,2,3,4,5),
				   					 Arrays.asList(2,6,45,2,12),
				   					 Arrays.asList(3,45,3));
		
		input.stream().flatMap(list -> list.stream()).sorted().forEach(l -> System.out.println(l));
		
		// Task: Flatten and add all values
		System.out.println("Sum: " + input.stream().flatMap(list -> list.stream()).mapToInt(i -> i.intValue()).sum());
	}

}
