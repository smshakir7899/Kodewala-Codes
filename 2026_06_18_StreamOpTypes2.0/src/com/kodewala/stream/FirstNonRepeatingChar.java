package com.kodewala.stream;

import java.util.Arrays;
import java.util.Optional;

public class FirstNonRepeatingChar
{

	public static void main(String[] args)
	{
		// Find first non repeating Character

		String word = "swiss";
		 
		
		Optional<Character> outChar = word.chars()
										  .mapToObj(c -> (char) c)
										  .filter(ch -> word.indexOf(ch) == word.lastIndexOf(ch))
										  .findFirst();
		
		System.out.println(outChar.get());
		
		
		 

	}

}
