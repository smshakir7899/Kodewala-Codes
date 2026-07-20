package com.kodewala.app;

public class SwitchExp {

	public static void main(String[] args) 
	{
		String userType = args[0];
		
		switch (userType.toLowerCase()) {//i am using lowercase here so if someone put argument as Platinum(P->Capital) can also work
		case "platinum": 
			System.out.println("You are eligible for 15% discount");
			break;
			
		case "gold":
			System.out.println("You are eligible for 10% discount");
			break;
			
		case "silver":
			System.out.println("You are not eligible for any discount");
			break;

		default:
			System.out.println("Invalid account type");
			break;
		}

	}

}
