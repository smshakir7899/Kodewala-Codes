package com.kodewala.streamapi.practice;

import java.util.Arrays;
import java.util.List;

public class TotalCharacters
{

	public static void main(String[] args)
	{
		// Task: Flatten and Find Total Character

		List<List<String>> input = Arrays.asList(Arrays.asList("Banglore", "Ahmedabad", "Jodhpur"),
												 Arrays.asList("Chennai", "Jodhpur"), 
												 Arrays.asList("Hyderabad"));
	 
		System.out.println(input.stream().flatMap(list -> list.stream()).mapToInt(l -> l.length()).sum());
	 
	}

}
