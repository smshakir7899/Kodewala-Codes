package com.kodewala.treeset;

import java.util.TreeSet;

public class Driver
{

	public static void main(String[] args)
	{

		TreeSet<String> set = new TreeSet<String>(); // there is no concept of hashing here 
		                                             // Instead, it uses compareTo() or compare() for positioning the elements in the tree
		                                             // elements will added serial wise 
				
			set.add("Shakir");
			set.add("Zaid");
			set.add("Akram");
			set.add("Sakib");
			set.add("Faisal");
			set.add("Nadeem");
			set.add("Atif");
			set.add("Nikhil");
			set.add("Faisal");
			// here we are not adding elements in alphabetic order still we get the sorted output
			// this is just because of using tree set
			// also here we put duplicates not as it is also provide uniqueness so duplicates does not print
			// we cannot add null set in tree set
			
			for (String string : set)
			{
				System.out.println(string);
			}
			
 			TreeSet<Integer> inte = new TreeSet<Integer>(); // here also we add integer not in numeric order 
 			                                                // but tree set sorted it 
 			inte.add(3);
 			inte.add(10);
 			inte.add(2);
 			inte.add(1);
 			
 			
 			for (Integer integer : inte)
			{
				System.out.println(integer);
			}

	}

}
