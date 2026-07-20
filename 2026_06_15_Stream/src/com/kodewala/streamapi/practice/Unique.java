package com.kodewala.streamapi.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Unique
{

	public static void main(String[] args)
	{
		// Task: Flatten and Find Unique

				List<List<String>> input = Arrays.asList(Arrays.asList("Banglore", "Ahmedabad", "Jodhpur"),
														 Arrays.asList("Chennai", "Jodhpur"), 
														 Arrays.asList("Hyderabad"));
			
				HashSet<String> set = new HashSet<String>();
				input.stream()
					 .flatMap(list -> list.stream())
					 .filter(i ->  set.add(i))
					 .forEach(i -> System.out.println(i));
				
				// Alternate way is to use distinct operation
	}

}
