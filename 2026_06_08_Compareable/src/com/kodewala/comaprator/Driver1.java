package com.kodewala.comaprator;

import java.util.TreeSet;

public class Driver1
{

	public static void main(String[] args)
	{
		Student s1 = new Student("Ali", 82);
		Student s2 = new Student("Zaid", 95);
		Student s3 = new Student("Aman", 80);
		Student s4 = new Student("Rahul", 70);
		Student s5 = new Student("Raj", 70);
		
		
		TreeSet<Student> sn = new TreeSet<Student>(new MarksComparator());
		sn.add(s1);
		sn.add(s2);
		sn.add(s3);
		sn.add(s4);
		sn.add(s5);
		
		for (Student student : sn)
		{
			System.out.println(student.name + " and " + student.marks);
		}
	}

}
