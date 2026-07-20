package com.kodewala.failfast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Driver2
{

	public static void main(String[] args)
	{
		List<String> brands = new ArrayList<String>();
		
		brands.add("Apple");
		brands.add("Samsung");
		brands.add("SanDisk");
		brands.add("Oppo");
		brands.add("Vivo");
		
		
		Iterator<String> itr =  brands.iterator();
		
		while (itr.hasNext())
		{
			String string = (String) itr.next();
			if (string.startsWith("S"))
			{
				//brands.remove(string); --> here ArrayList is removing element not iterator 
				                                            // that's why it shows exception
				itr.remove(); // here iterator is removing so it also changing exp mod count
			}
			
		}
		
		System.out.println(brands);

	}

}
