package com.kodewala.failfast;

import java.util.ArrayList;
import java.util.List;

public class Driver1
{

	public static void main(String[] args)
	{
		List<String> list = new ArrayList<String>();
		
		list.add("Suresh");
		list.add("Shakir");
		list.add("Sakib");
		list.add("Naresh");
		//list.add("Narendra");
		// here this list is not showing any exception as usne pehle Naresh(index 3) ko remove kiya fir Narendra index 3 pe aagya
		// and iterator aage badh gya to waha koi mila hi nahi isliye koi exception nhi aaya... thats why we are commenting Narendra   
		
		
		
		System.out.println(list);
		
		for (String name : list)
		{
			if (name.startsWith("N"))
			{
				list.remove(name);
			}
		}
		
		System.out.println("\n" + list);
	}

}
