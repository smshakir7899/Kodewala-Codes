package com.kodewala.thread;

public class ClassTask1 extends Thread
{
	@Override
	public void run()
	{
		for (int i = 1; i <= 20; i++)
		{
			if (getName().equals("Even") && i %2 == 0)
			{
				System.out.println("Even: " + i);
				
				if (i == 10)
				{
					System.out.println("Sending " + getName() + " to sleep");
					try
					{
						Thread.sleep(5000);
					} catch (InterruptedException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
			
			else if (getName().equals("Odd") && i %2 != 0)
			{
				System.out.println("Odd: " + i);
				
				if (i == 9)
				{
					System.out.println("Sending " + getName() + " to sleep");
					try
					{
						Thread.sleep(5000);
					} catch (InterruptedException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}
	
	public static void main(String[] args)
	{
		ClassTask1 task1 = new ClassTask1();
		task1.setName("Even");
		
		ClassTask1 task2 = new ClassTask1();
		task2.setName("Odd");
		
		task1.start();
		task2.start();
	}
}
