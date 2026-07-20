package com.kodewala.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Driver1
{

	public static void main(String[] args)
	{
		
		Map<String, String> stateAndCity = new HashMap<String, String>();
		
		stateAndCity.put("Rajasthan", "Jodhpur");
		stateAndCity.put("Uttar Pradesh", "Lucknow");
		stateAndCity.put("Karnataka", "Banglore");
		stateAndCity.put("Gujrat", "Ahmedabad");
		stateAndCity.put("Maharashtra", "Mumbai");
		
		System.out.println(stateAndCity.get("Rajasthan"));
		System.out.println();
		System.out.println(stateAndCity+"\n");
		
		Set<Entry<String, String>> entrySet = stateAndCity.entrySet();
		
		Iterator<Entry<String, String> > itr = entrySet.iterator();
		while (itr.hasNext())
		{
			Entry<String, String> ent = itr.next();
			System.out.println(ent.getKey() + " and " + ent.getKey());
			
		}
		

	}

}
