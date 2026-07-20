package com.kodewala.linkedlist;

import java.util.LinkedList;

public class Driver
{

	public static void main(String[] args)
	{
		LinkedList<String> studentList = new LinkedList<String>();
		studentList.add("Shakir");
		studentList.add("Faisal");
		studentList.add("Sakib");
		studentList.add("Ritesh");
		studentList.add("Rahul");
		
		System.out.println("Student List: "+studentList);
		
		studentList.add(2, "Nikhil");
		
		System.out.println("\nUpdated List: "+studentList);
		
		studentList.remove(0);

		System.out.println("\nLatest List: "+studentList);

	}

}
