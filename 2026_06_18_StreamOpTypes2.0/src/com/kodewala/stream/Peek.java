package com.kodewala.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Peek
{

	public static void main(String[] args)
	{
		List<String> list = Arrays.asList("Banglore","Chennai");
		
		Stream<String> peek = list.stream().peek(  value -> System.out.println("Peeking: " +value ));
		
		peek.forEach(value -> System.out.println("Final: " + value));
	}

}
