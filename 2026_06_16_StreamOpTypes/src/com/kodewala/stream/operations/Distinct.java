package com.kodewala.stream.operations;
 
import java.util.Arrays;
import java.util.List;

public class Distinct
{

	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(1,3,4,2,4,5,32,7,5,3,9,5,2,2,9);
		
		// Task: Remove the duplicates 
		list.stream()
			.distinct()
			.forEach(i -> System.out.println(i));

	}

}
