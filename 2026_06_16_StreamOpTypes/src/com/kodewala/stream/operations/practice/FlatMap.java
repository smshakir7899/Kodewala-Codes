package com.kodewala.stream.operations.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap
{

	public static void main(String[] args)
	{
		List<List<String>> skills = Arrays.asList(Arrays.asList("Java","SQL"),
									Arrays.asList("Spring","AWS"),
									Arrays.asList("Docker","Java"));
		
		System.out.println(skills.stream()
								 .flatMap(list -> list.stream())
								 .distinct()
								 .sorted()
								 .collect(Collectors.toList()));

	}

}
