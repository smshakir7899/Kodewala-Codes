package com.kodewala.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinimumAndMaximum 
{

	public static void main(String[] args)
	{
		List<Integer> input = Arrays.asList(1,4,5,3,6,64);
		
//		int output = input.stream().sorted().findFirst().get();
		Optional<Integer > output = input.stream().min((a,b) -> a-b);
		System.out.println(output.get());
		
		
		Optional<Integer> output1 = input.stream().max((a,b) -> a-b);
		System.out.println(output1.get());
				
	}

}
