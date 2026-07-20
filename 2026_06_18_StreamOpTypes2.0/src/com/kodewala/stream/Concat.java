package com.kodewala.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Concat
{

	public static void main(String[] args)
	{
		List<String> list1 = Arrays.asList("Banglore","Delhi","Pune","Chennai","Hyderabad");
		List<String> list2 = Arrays.asList("Delhi","Noida","Mysore","Delhi");
		
		//Stream.concat --> merge multiple lists 
		Stream.concat(list1.stream(), list2.stream()).distinct()
			  .forEach(list -> System.out.println(list));
	}

}
