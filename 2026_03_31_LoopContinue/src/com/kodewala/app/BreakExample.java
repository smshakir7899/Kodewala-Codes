package com.kodewala.app;

public class BreakExample 
{

	public static void main(String[] args) 
	{
		String items[] = {"Laptop", "Mobile", "Keyboard", null, "Monitor", "Printer", "Scanner", "Speaker", "Headphones", "Smart Watch", 
				"Television", "Camera", "Projector", "Router", "Modem", "Hard Disk", "Pendrive", "Microphone", null, 
				"Charger", "Battery", "Fan", "Air Conditioner", null, "Washing Machine", "Microwave", "Iron", 
				"Mixer Grinder", "Tablet", null};
		for(int index=0; index<items.length; index++)
		{ 
			String itemName=items[index];

			if (itemName == null || itemName.startsWith("S"))
			{
				continue;//skip the current iteration
			}		
			
			System.out.println(itemName.toUpperCase());
		}
	}

}
