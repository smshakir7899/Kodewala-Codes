package com.kodewala.hashcode;

import java.util.HashSet;
import java.util.Set;

public class Driver
{

	public static void main(String[] args)
	{
		
		Set<String> cities = new HashSet<String>(); // default capacity for hashset is 16.
		
		cities.add("Jodhpur");
		cities.add("Jodhpur");
		cities.add("Jaipur");
		cities.add("Jalore");
		cities.add("Ajmer");
		cities.add("Beawer");
		
		System.out.println("Jodhpur".hashCode());  // Output ---> 229193156 as this is the unique hash code for Jodhpur
		System.out.println("Jaipur".hashCode());  // -2083589157
		
		// Now we are going to see why HashSet are unordered and how they provide uniqueness 
		// There is a formula for deciding the element's position which we don't have to remember, but here using for explanation
		int hash = "Jodhpur".hashCode();
		hash = hash ^ (hash >>> 16);
		int index = (16-1) & hash;
		
		System.out.println("Jodhpur is at position(out of 0-15) of: "+index);
		// you can check even in debugging
		
		System.out.println(cities);
		// here you can see in the output that list are unordered as well as no duplicates allowed
	}

}
