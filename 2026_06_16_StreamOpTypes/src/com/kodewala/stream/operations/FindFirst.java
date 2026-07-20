package com.kodewala.stream.operations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirst
{

	public static void main(String[] args)
	{
		List<Integer> input = Arrays.asList(7,2,3,4,23,22,1,2,4,2);
		
		// Task find only first element 
		Optional<Integer> output =  input.stream().findFirst();
		// optional is a class introduced in java 8 to avoid NullPointerException
		
		
		//List<Integer> output = input.stream().findFirst(); --> This will not work cz 
		System.out.println(output); // Output -> Optional[7]
		System.out.println(output.get()); // Output -> 7
	}

}
