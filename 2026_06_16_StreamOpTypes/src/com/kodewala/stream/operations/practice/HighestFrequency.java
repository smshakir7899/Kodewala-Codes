package com.kodewala.stream.operations.practice;

import java.util.Optional;

public class HighestFrequency
{

	public static void main(String[] args)
	{
		String word="abacbadcbabbc"; 
		
		Optional<Character> outChar = word.chars()
		  .mapToObj(c -> (char) c)
		  .filter(ch -> word.indexOf(ch) != word.lastIndexOf(ch))
		  .skip(1)
		  .findFirst();
		
		if (outChar.isPresent())
		{
			char ch = outChar.get();
			long index = word.indexOf(ch);
			long count = word.chars().filter(c -> c==ch).count();
			System.out.println(ch+" "+index+" "+count);
			
		}
//		System.out.println(ch);
//		System.out.println(outChar.get());
	}

}
