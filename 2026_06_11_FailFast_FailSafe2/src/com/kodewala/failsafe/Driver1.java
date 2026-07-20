package com.kodewala.failsafe;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Driver1
{

	public static void main(String[] args)
	{

		List<String> choclateNames = new CopyOnWriteArrayList();

		choclateNames.add("Dairy Milk");
		choclateNames.add("Kitkat");
		choclateNames.add("Milky Bar");
		choclateNames.add("Perk");

		Iterator<String> itr = choclateNames.iterator();

		while (itr.hasNext())
		{
			String string = (String) itr.next();

			// choclateNames.remove(2); // if you are removing using index number then as it
			// is a loop
			// it first remove MilkyBar ----> then Perk is on index 2... then it removes
			// Perk
			// after that nothing is on index 2 that's why it throws
			// ArrayIndexOutOfBoundsException

			choclateNames.remove("Perk");
			System.out.println("Removing the junk element ");
			System.out.println(choclateNames);
		}
	}

}
