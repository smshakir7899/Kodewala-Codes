package com.kodewala.linkedhhashset;

import java.util.LinkedHashSet;

public class Driver
{

	public static void main(String[] args)
	{
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		// LinkedHashSet --> LinkedList + HashSet (doubly LinkedList is used for maintaining order)
		// that's why LinkedHashSet is ordered
		
		set.add("Shakir");
		set.add("Sakib");
		set.add("Faisal");
		set.add("Nadeem");
		set.add("Nikhil");
		
		for (String string : set)
		{
			System.out.println(string);
		}
		
	}

}
