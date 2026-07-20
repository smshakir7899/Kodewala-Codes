package com.kodewala.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Driver4
{

	public static void main(String[] args)
	{
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		String result1 = map.put(1, "Rahul");
		System.out.println("Result 1: " + result1); // so ".put" return previous value
		System.out.println();
		System.out.println(map);
		System.out.println();
		
		
		
		String result2 = map.put(1, "Shakir");
		System.out.println("Result 2: " + result2);
		System.out.println(map);
	}

}
