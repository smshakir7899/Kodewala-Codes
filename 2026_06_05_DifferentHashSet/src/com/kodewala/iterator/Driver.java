package com.kodewala.iterator;

import java.util.HashSet;
import java.util.Iterator;

public class Driver
{

	public static void main(String[] args)
	{
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("Banglore"); // return type of .add is boolean
		set.add("Hydrabad");
		set.add("Chennai");
		set.add("Delhi");
		set.add("Chandigarh");
		
		//there is nothing like ".get" in set(it is in the Map)  (Because HashSet does not store elements by index.)
		// in set we use ".contains"
		System.out.println(set.contains("Delhi"));
		
		
		
		// TASK:- GET THE CITY NAME STARTS WITH "C"
		
		// #Method 1: Using for loop
		for (String elements : set)
		{
			if(elements.startsWith("C"))
			{
				System.out.println(elements);
			}
		}
		
		// #Method 2: Using iterator
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) // Check that: Is there another element available? (if yes ...enters loop & if no...stops)
		{
			String element = itr.next();  // ".next" reads the next element. 
			if(element.startsWith("C"))
			{
				System.out.println("element starts with C : " + element);
			} 	
		}
 
	}

}
