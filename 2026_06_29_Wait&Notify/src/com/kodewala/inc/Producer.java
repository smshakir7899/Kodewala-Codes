package com.kodewala.inc;

public class Producer extends Thread
{
	Task task;

	public Producer(Task task)
	{

		this.task = task;
	}

	@Override
	public void run()
	{
		for (int i = 0; i < 10; i++)
		{
			try
			{
				//Thread.sleep(2000);
				task.producer(i);
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
