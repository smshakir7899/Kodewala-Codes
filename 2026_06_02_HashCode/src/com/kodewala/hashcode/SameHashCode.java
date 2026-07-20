package com.kodewala.hashcode;

class Student
{
	int id;

	Student(int id)
	{
		this.id = id;
	}
	
	@Override
	public int hashCode()
	{
		return 12344321; // Now All object will get same hashcode
	}
}

public class SameHashCode
{

	public static void main(String[] args)
	{
		Student s1 = new Student(1);
		Student s2 = new Student(2);
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s1 == s2); // --> false as both are 2 different object
		System.out.println(s1.equals(s2)); // --> also false as content is also different (i.e. 1 & 2)
		
		
	}

}
