package com.kodewala.failfast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Driver
{

	public static void main(String[] args)
	{
 
List<String> list = new ArrayList<String>();
		
		list.add("Apple");
		list.add("Banana");
		list.add("Pineapple");
		list.add("Mango");
		
		System.out.println(list);
		
//		for (String string : list)
//		{
//			list.remove(1);
//		}
//			
//		System.out.println(list);
		
		// for loop internally used iterator but in this case iterator fixed expected mod count so which cannot modify in loop 
		// 
		
	 	Iterator<String> itr = list.iterator();
	 	while (itr.hasNext())
		{
			String str = (String) itr.next();
			if (str.startsWith("A"))
			{
				//list.remove(1); // here in this if we do this i.e. directly removing from list it also throws exception
				itr.remove(); // here we removing with using iterator so it changs both mod count as well as expected mod count
				
				System.out.println(" removing the junk element");
			}
			
			System.out.println(list);
			
		}
	}

}
