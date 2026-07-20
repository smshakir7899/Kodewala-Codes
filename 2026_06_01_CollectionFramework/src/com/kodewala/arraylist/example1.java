package com.kodewala.arraylist;

import java.util.ArrayList;

public class example1
{

	public static void main(String[] args)
	{
		ArrayList<String> dayList = new ArrayList<String>();
		
		dayList.add("Monday");
		dayList.add("Tuesday");
		dayList.add("Thursday");
		dayList.add("Thursday");
		dayList.add("Friday");
		dayList.add("Saturday");
		dayList.add("Sunday");
	
		System.out.println("List of Days: "+dayList);
		
		dayList.add(2, "Wednesday");
		System.out.println("\nUpdated List of Days: "+dayList);
		
		dayList.remove(4);
		System.out.println("\nFinal List of Days: "+dayList);

	}

}
