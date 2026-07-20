package com.kodewala.override;

import java.util.HashSet;

public class Driver1
{

	public static void main(String[] args)
	{
 
		HashSet<String> cityList = new HashSet<String>();
		
		
		cityList.add("Jodhpur1");
		cityList.add("Jodhpur2");
		cityList.add("Jodhpur3");
		cityList.add("Jodhpur4");
		cityList.add("Jodhpur5");
		cityList.add("Jodhpur6");
		cityList.add("Jodhpur7");
		cityList.add("Jodhpur8");
		cityList.add("Jodhpur9");
		cityList.add("Jodhpur10");
		cityList.add("Jodhpur11");
		cityList.add("Jodhpur12");
		
		System.out.println(cityList);
		
		cityList.add("Pali");
		System.out.println(cityList);
	}

}
