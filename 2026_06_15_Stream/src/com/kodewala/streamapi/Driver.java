package com.kodewala.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver
{

	public static void main(String[] args)
	{
 
		List<String> cityList = Arrays.asList("Jodhpur","Jaipur","Ajmer","Beawer","Marwad","Udaipur","Bhilwara");
		
		cityList.stream().map(l -> l.toLowerCase()).filter(list -> list.startsWith("J"));
		//This will not perform any task
		
		
		//Intermediate operation are lazy they will not perform until and unless terminal will be called.
		//Terminal operation will be called only once (when it called it will terminate the stream).
		List<String> updatedCityList = cityList.stream().filter(list -> list.startsWith("B") && list.length()>6)
				.map(l -> l.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(updatedCityList);
		
//		long updatedCityLists = cityList.stream().filter(list -> list.startsWith("J"))
//				.map(l -> l.toLowerCase()).count();
//		 
//		System.out.println(updatedCityLists);
	}

}
