package com.kodewala.comaprator;

import java.util.Comparator;

public class FirstNameComparator implements Comparator<Employee>
{
	
	@Override
	public int compare(Employee f1, Employee f2)
	{
		if (!f1.firstName.equals(f2.firstName))
		{
			return f1.firstName.compareTo(f2.firstName);
		}
		return f1.lastName.compareTo(f2.lastName);
	}
	

}
