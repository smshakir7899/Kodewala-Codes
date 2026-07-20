package com.kodewala.map;

 
import java.util.HashMap; 
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Driver
{

	public static void main(String[] args)
	{
//		Set<String> set = new HashSet<String>();
//		set.add("Apple");
//		set.add("Samsung");
 
		Map<String, String> brandAndModel = new HashMap<String, String>();
		
		brandAndModel.put("Nothing", "Phone 2");
		brandAndModel.put("Apple", "Iphone 17"); // 5th bucket -- > O(1) -- > "Apple".hashCode() & 15 -- > 5th index
		brandAndModel.put("Vivo", "V 70");
		brandAndModel.put("Realme", "Narzo 50");
		brandAndModel.put("Vivo", "V 70");  // No duplicate keys
		
		System.out.println(brandAndModel.get("Apple")); // O(1)
		// HashMap internally first find  "Apple".hashcode ---> find bucket --> search key of that bucket --> return value
		// How does HashMap works internally OR How put method works OR How does get works ---> all are same
		
		
		System.out.println(brandAndModel);
		System.out.println();
		//Set<Entry<String, String>> 
		 
		
		// Convert the map to set of entries --> to iterate the values as map is not the part of Iterator or class
		                                                                                     // see hierarchy diagram
		Set<Entry<String,String>> entrySet = brandAndModel.entrySet();
		
		// Convert the entry set to iterator
		Iterator<Entry<String, String>> ent = entrySet.iterator();
		
		// Iterate it
		while (ent.hasNext()) // hasNext check that if there any element present next
		{
			Entry<String, String> entry = ent.next(); // go to next
			System.out.println(entry.getKey() + " and " + entry.getValue());
			
		}
		
 
		
	}

}
