package com.kodewala.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Driver5
{

	public static void main(String[] args)
	{
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(103, "Shakir");
		map.put(101, "Nikhil");
		map.put(104, "Sakib");
		map.put(107, "Faisal");
		map.put(105, "Ronak");
		map.put(106, "Ashutosh");
		map.put(102, "Aman");
		
		System.out.println(map.get(103)); // get method
		System.out.println(map.get(777)); // null
		
		System.out.println(map.containsKey(101)); // containsKey() --> output ---> true
		
		System.out.println(map.containsValue("Nikhil")); // containsValue() --> output ---> true

		System.out.println(map.keySet()); //keySet ----> only return keys
		
		System.out.println(map.values()); // values ---> only return values
		
		System.out.println(map.entrySet()); // entrySet ---> return key-value pair.
	
		System.out.println(map.size());
		map.clear(); // all values are vanished
		System.out.println(map.size());
		
		System.out.println(map.isEmpty()); // isEmpty --> check whether empty or not
		
	}

}
