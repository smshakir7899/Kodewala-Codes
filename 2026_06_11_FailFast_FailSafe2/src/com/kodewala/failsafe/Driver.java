package com.kodewala.failsafe;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Driver
{

	public static void main(String[] args)
	{

		List<String> list = new CopyOnWriteArrayList();

		list.add("Apple");
		list.add("Banana");
		list.add("Pineapple");
		list.add("Mango");

		System.out.println(list);

		Iterator<String> itr = list.iterator();
		while (itr.hasNext())
		{
			String str = (String) itr.next();

			list.remove("Apple"); // without copy on arraylist it will throw ConcurrentModificationException
			System.out.println(" removing the junk element");

			System.out.println(list);

		}
	}

}
