package com.kodewala.comaprator;

import java.util.Comparator;

public class MarksComparator implements Comparator<Student>
{
	@Override
	public int compare (Student t1, Student t2)
	{
		if (t2.marks - t1.marks != 0)
		{
			return t2.marks - t1.marks;
		}
		
		return t1.name.compareTo(t2.name);
	}
}
