package com.kodewala.hashmap;

import java.util.HashMap;

public class Driver2
{

	public static void main(String[] args)
	{

		HashMap<String, String> cityAndState = new HashMap<String, String>();
		
		cityAndState.put("Rajasthan1", "Jodhpur1");
		cityAndState.put("Rajasthan2", "Jodhpur2");
		cityAndState.put("Rajasthan3", "Jodhpur3");
		cityAndState.put("Rajasthan4", "Jodhpur4");
		cityAndState.put("Rajasthan5", "Jodhpur5");
		cityAndState.put("Rajasthan6", "Jodhpur6");
		cityAndState.put("Rajasthan7", "Jodhpur7");
		cityAndState.put("Rajasthan8", "Jodhpur8");
		cityAndState.put("Rajasthan9", "Jodhpur9");
		cityAndState.put("Rajasthan10", "Jodhpur10");
		cityAndState.put("Rajasthan11", "Jodhpur11");
		cityAndState.put("Rajasthan12", "Jodhpur12");
		
		
		System.out.println(cityAndState);
		
		cityAndState.put("Rajasthan13", "Jodhpur13");
		System.out.println();
		System.out.println(cityAndState);
		
	}

}
