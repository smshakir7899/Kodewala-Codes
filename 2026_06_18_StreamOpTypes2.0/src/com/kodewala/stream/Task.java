package com.kodewala.stream;

import java.util.Arrays;
import java.util.List; 

public class Task
{

	public static void main(String[] args)
	{
		List<String> list = Arrays.asList("Banglore","Chennai","Mysore","Delhi");
		
//		Collections.reverse(list);
//		System.out.println(list);
		
		 
		list.stream()
			.map(list1 -> new StringBuffer(list1).reverse() )
			.forEach(l -> System.out.println(l));
		
		String task = "Tranforming code into career";
		
		String reverse = Arrays.stream(task.split (" ") ).reduce(" ", (a,b) ->b+" "+a);
		System.out.println(reverse);
		
 	}

}
