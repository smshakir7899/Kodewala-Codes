package com.kodewala.stream;

//TASK -> Make a brands list and from that list find the brands starting with "S" and convert them to upper case
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver1
{

	public static void main(String[] args)
	{
		List<String> brands = Arrays.asList("Apple","Samsung","Sony","Realme","Vivo","Nokia","Micromax","Nothing");
		
		List<String> processedBrands = brands.stream().filter(b -> b.startsWith("S")).map(word -> word.toUpperCase())
				.collect(Collectors.toList()); 
		
		List<String> lowerCaseBrands = brands.stream().filter(b -> b.startsWith("N")).map(w -> w.toLowerCase())
				.collect(Collectors.toList());
		
		System.out.println(processedBrands);
		
		System.out.println(lowerCaseBrands);
	}

}
