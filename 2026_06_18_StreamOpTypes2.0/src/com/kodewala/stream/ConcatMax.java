package com.kodewala.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ConcatMax
{

	public static void main(String[] args)
	{
		List<String> list1 = Arrays.asList("Banglore", "Delhi", "Pune", "Chennai", "Hyderabad");
		List<String> list2 = Arrays.asList("Delhi", "Noida", "Mysore", "Delhi");

		Optional<String> optional = Stream.concat(list1.stream(), list2.stream())
										  .max(Comparator.comparingInt(w -> w.length()));
		System.out.println(optional.get());
 
	}

}
