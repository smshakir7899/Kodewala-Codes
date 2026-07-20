package com.tasks.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNum
{

	public static void main(String[] args)
	{
		List<Integer> num = Arrays.asList(12, 7, 25, 48, 91, 34, 56, 19, 83, 100, 67, 
										  22, 15, 88, 43, 60, 71, 18, 95,
										  40, 11, 52, 79, 64, 37, 26, 99, 14, 81, 30);
		// Approach 1:
		System.out.println(num.stream()
							  .filter(nu ->nu%2==0)
							  .collect(Collectors.toList()));

		// Approach 2:
		num.stream()
		   .filter(nu ->nu%2==0)
		   .forEach(n ->System.out.println(n));
		
		// Approach 3:
		System.out.println(num.stream().collect(Collectors.groupingBy(nu -> nu % 2 == 0)));
	}

}
