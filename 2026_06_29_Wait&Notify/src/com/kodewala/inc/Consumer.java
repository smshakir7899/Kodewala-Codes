package com.kodewala.inc;

public class Consumer extends Thread
{

	Task task;

	public Consumer(Task task)
	{
		super();
		this.task = task;
	}

	public void run()
	{
		for (int i = 0; i < 10; i++)
		{
			try
			{
				// Thread.sleep(2000);
				task.consumer();
				// Thread.sleep(3000);
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
