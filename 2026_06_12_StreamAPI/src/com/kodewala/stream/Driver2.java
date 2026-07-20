package com.kodewala.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver2
{

	public static void main(String[] args)
	{

		List<Integer> number = Arrays.asList(1, 2, 4, 5, 7, 6, 23, 456, 567);

		List<Integer> processedNumbers = number.stream().filter(nu -> nu % 2 == 0).map(n -> n * 10)
				.collect(Collectors.toList());

		System.out.println(processedNumbers);

		List<Integer> num = Arrays.asList(1, 3);

	}

}
