package com.kodewala.stream.operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting
{

	public static void main(String[] args)
	{
		
		List<Integer> list = Arrays.asList(1,7,51,66,11,8,12);
		// Sorting in 
		List<Integer> output = list.stream().sorted().collect(Collectors.toList());
		System.out.println(output);
		
		 List<Integer> output2 = list.stream().sorted((a,b) -> b-a).collect(Collectors.toList());
		 System.out.println(output2);
		//System.out.println(list.stream().sorted((a,b) -> b-a));
	}

}
