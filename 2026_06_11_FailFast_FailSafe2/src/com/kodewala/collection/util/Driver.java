package com.kodewala.collection.util;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Driver
{

	public static void main(String[] args)
	{
		// HashMap is not thread-safe.
		// Multiple threads accessing/modifying it simultaneously
		// may cause inconsistent results.
		Map<String, String> products = new HashMap<String, String>(); 
		
		products.put("Apple", "Iphone 17");
		products.put("Samsung", "S26");
		products.put("Realme", "Narzo 30");
		
		// Creates a read-only (unmodifiable) view of the map.
		// Any modification operation like put(), remove(), clear()
		// will throw UnsupportedOperationException.
		// Map<String, String> readOnlyMap = Collections.unmodifiableMap(products);
		
		
		// for making thread safe we use synchornizedMap
		Map<String, String> newProduct = Collections.synchronizedMap(products);
		// with using of synchronized map whole object's bucket is locked but we want only selected bucket will lock
		
		products.put("Nokia", "1100");
		System.out.println(products);
		// we want that rest all should open so that another person will also work on the same code --> for this --> ConcurrentHashMap
		
		// ConcurrentHashMap is a better choice for highly concurrent applications because it does not lock the entire map for every operation
		// Multiple threads can read and update the map concurrently.
		// It provides better performance than synchronizedMap
		
		Map<String, String> newMap = new ConcurrentHashMap<String, String>();
	
	}


}
