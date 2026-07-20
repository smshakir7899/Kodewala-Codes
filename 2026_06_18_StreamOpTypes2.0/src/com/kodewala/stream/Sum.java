package com.kodewala.stream;

import java.util.Arrays;
import java.util.List;

public class Sum
{

	public static void main(String[] args)
	{
		List<Integer> input = Arrays.asList(1,3,5,7,8,5);
		
		int output = input.stream().filter(n -> n %2 !=0 ).reduce(0, (a,b) -> a+b);
		
		System.out.println(output);
				
	}

}
