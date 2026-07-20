package com.amazon.user;

public class UserMgmt
{
	public void showUserInfo(String type)
	{

		if (type.equalsIgnoreCase("retail"))
		{

			System.out.println("----- Retail User -----");
			System.out.println("Name      : Rahul Sharma");
			System.out.println("User ID   : R101");
			System.out.println("Email     : rahul@gmail.com");
			System.out.println("Membership: Gold");
			System.out.println("Orders    : 25");

		} else if (type.equalsIgnoreCase("reseller"))
		{

			System.out.println("----- Reseller User -----");
			System.out.println("Business  : Shakir Traders");
			System.out.println("User ID   : RS501");
			System.out.println("Email     : sales@shakirtraders.com");
			System.out.println("GST No    : 29ABCDE1234F1Z5");
			System.out.println("Discount  : 18%");
			System.out.println("Bulk Orders: Enabled");

		} else
		{

			System.out.println("Invalid user type!");
		}
	}
}
