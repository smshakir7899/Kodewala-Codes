package com.kodewala.comapreable;

import java.util.TreeSet;

class Student implements Comparable<Student>
{
	int marks;
	String name;
	
	public Student(int marks, String name)  
	{
		super();
		this.marks = marks;
		this.name = name;
	}
	
	@Override 
	public int compareTo(Student s)
	{
		System.out.println(this.name + " compared with " + s.name);
		
		if (this.marks != s.marks)
		{
			return s.marks - this.marks; // Descending order (Difference ---> Positive)
		}
		return this.name.compareTo(s.name);
	}
	
	
}
public class Driver2
{

	public static void main(String[] args)
	{
		 
		Student s1 = new Student(84, "Shakir");
		Student s2 = new Student(64, "Nikhil");
		Student s3 = new Student(94, "Prajwal");
		Student s4 = new Student(60, "Sayyed"); // here two comparison done check output 
		Student s5 = new Student(85, "Aman");   // here two comparison done check output 
		Student s6 = new Student(84, "Kaleem"); // here two comparison done check output 
		
		TreeSet<Student> ts = new TreeSet<Student>();
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		ts.add(s6);
		
		System.out.println();
		
		for (Student snt : ts)
		{
			System.out.println(snt.name + " and " + snt.marks);
			
		}
	}

}
