package com.kodewala.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Partition
{

	public static void main(String[] args)
	{
		List<String> inpList = Arrays.asList("Bangalore", "Pune", "Chennai", "Hyderabad", "Delhi", "Noida", "Mysore");
		
		// Partition the data on the based on some condition(here length>6) 
		Map<Boolean, List<String>> out = inpList.stream()
												.collect(Collectors.partitioningBy(list -> list.length() >6));
		System.out.println(out);
		
	}

}
