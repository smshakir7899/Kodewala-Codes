package com.kodewala.stream;

import java.util.Arrays;
import java.util.List;

public class FInd3rdHighest
{

	public static void main(String[] args)
	{
		List<Integer> input = Arrays.asList(1,5,3,6,3,6,8,18,7,12,78,54);
		
		int output = input.stream()
						  .distinct()
						  .filter( n -> n%2 == 0 )
						  .sorted((a,b) -> b -a )
						  .skip(2)
						  .findFirst()
						  .get();
		
		System.out.println(output);
	}

}
