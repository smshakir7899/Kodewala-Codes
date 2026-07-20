package com.kodewala.stream.practice;

import java.util.Arrays; 
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task
{

	public static void main(String[] args)
	{
		List<String> list = Arrays.asList("Irfan","Azmat","Saqib","Ritesh","Shakir","Kodewala");
		
		// Task 1: Join a list of string into a single comma separated string which is capitalized and sorted alphabetically
		System.out.println(list.stream()
							   .sorted()
							   .map(l -> l.toUpperCase())
							   .collect(Collectors.joining(",")));
		System.out.println();
		 
		
		List<Integer> numbers = Arrays.asList(5,32,-24,12,-6,4,26,-6,12,7,
												12,-10,-24,32,32,6,7,11,44,7);
		
		// Task 2: Find the frequency of each element in the list  
		 System.out.println(numbers.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
		 System.out.println();
		 
		
		List<String> items = Arrays.asList("apple","banana","apple","orange","banana","apple");
		
		// Task 3: Count the number of element in each group after grouping the element by their length
		System.out.println( items.stream().collect(Collectors.groupingBy(l -> l.length(), Collectors.counting())));
	}

}
