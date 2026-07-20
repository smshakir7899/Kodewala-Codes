package com.kodewala.Fast;

import java.util.ArrayList;
import java.util.List;

public class Driver
{

	public static void main(String[] args)
	{
 
		List<String> items = new ArrayList<String>();
		
		items.add("Dollar");
		items.add("Rupees");
		items.add("Euro");
		items.add("Riyal");
		items.add("Dirham");
		
		System.out.println(items);
		
		for (String item : items) // loop through 
		{
			items.remove(1);
//			if (item.startsWith("D"))
//			{
//				items.remove(item);
//			}
		}
		
		System.out.println(items);
	}

}
