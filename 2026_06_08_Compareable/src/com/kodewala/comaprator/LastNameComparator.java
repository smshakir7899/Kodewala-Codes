package com.kodewala.comaprator;

import java.util.Comparator;

public class LastNameComparator implements Comparator<Employee>
{
	
	@Override
	public int compare(Employee p1 , Employee p2)
	{
		if (!p1.lastName.equals(p2.lastName))
		{
			return p1.lastName.compareTo(p2.lastName);
		}
		return p1.firstName.compareTo(p2.firstName);
	}

}
