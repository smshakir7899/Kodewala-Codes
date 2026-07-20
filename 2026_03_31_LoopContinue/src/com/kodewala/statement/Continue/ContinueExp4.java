package com.kodewala.statement.Continue;

public class ContinueExp4
{

	public static void main(String[] args)
	{
		for (int i = 1; i <= 20; i++)
		{
			if(i%2==0 || i%5==0)
			{
				continue;
			}
			
			
			System.out.println(i);
			
		}

	}

}
