package com.kodewala.stream;
 
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver
{

	public static void main(String[] args)
	{
		List<String> brands = Arrays.asList("Apple","Samsung","Realme","Vivo","Nokia","Micromax");
		
		System.out.println("Input: " + brands);
		// Process the collection.
		// Task -> Convert all the brands to upper case.
		
		// 1-> Convert the collection(list) to stream object   
		Stream<String> stream = brands.stream();
		
		// 2-> Apply processing Logic (intermediate & terminal)
		Stream<String> upperCaseStream = stream.map(word -> word.toUpperCase());
		
		// 3-> Collect the result / terminate the stream
		List<String> processedBrands = upperCaseStream.collect(Collectors.toList());
		
		System.out.println("Output: " + processedBrands);
		
		//THESE MULTIPLE LINES USED JUST TO UNDRSTAND...YOU CAN DO THIS EVEN IN SINGLE LINE 
		
		//List<String> processedBrand = brands.stream().map(word -> word.toUpperCase()).collect(Collectors.toList());
		List<String> pb = brands.stream().map(w -> w.toLowerCase()).collect(Collectors.toList());
		System.out.println(pb);
		
	}

}
