package com.kodewala.str.junebatch.task;

public class Driver
{

	public static void main(String[] args)
	{
		QueryConstructor constructor = new QueryConstructor();
//		String query = constructor.constructQuery("ABC12345", 0);
//		System.out.println(query);
		
//		String query = constructor.constructQuery(null, 18880);
//		System.out.println(query);
		
		String query = constructor.constructQuery(null, 0);
		System.out.println(query);
	}

}
