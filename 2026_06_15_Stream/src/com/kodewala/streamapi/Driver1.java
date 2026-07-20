package com.kodewala.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver1
{

	public static void main(String[] args)
	{
 
		List<List<String>> input = Arrays.asList(Arrays.asList("Banglore","Chennai"), 
				Arrays.asList("Hyderabad","Ahmedabad","Delhi"), Arrays.asList("Jodhpur")); 
		
		System.out.println("1D List: " + input);
		
		List<String> flattentList = input.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
		System.out.println("\n2D List: " + flattentList);
		
		flattentList.stream().filter(w -> w.startsWith("B") && w.length()>6).forEach(word -> System.out.println(word));
		// forEach is also an terminate operation 
				
	}

}
