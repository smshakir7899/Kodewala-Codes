package com.kodewala.stream.operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Skip
{

	public static void main(String[] args)
	{

		List<Integer> input = Arrays.asList(1,54,2,7,89,4,2);
		
		// Task: skip 1 element from starting 
		List<Integer> output = input.stream().skip(1).collect(Collectors.toList());
		System.out.println(output);
		
		// Task: skip 2 element from starting 
		List<Integer> output1 = input.stream().skip(2).collect(Collectors.toList());
		System.out.println();
		System.out.println(output1);
		
		
	}

}
