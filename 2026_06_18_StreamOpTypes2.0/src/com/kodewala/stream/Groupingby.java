package com.kodewala.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Groupingby
{

	public static void main(String[] args)
	{
		List<String> inpList = Arrays.asList("Bangalore", "Pune", "Chennai", "Hyderabad", "Delhi", "Noida", "Mysore");
		
		// Task: 
		Map<Integer, List<String>>outList= inpList.stream().collect(Collectors.groupingBy(city -> city.length()));
		System.out.println(outList);
		
		// Task: 
		Map<Integer, List<String>> out = inpList.stream().filter(w -> w.length()>6).collect(Collectors.groupingBy(city -> city.length()));
		System.out.println(out);
		
		// Task ; collectoins.counting
		
 	}

}
