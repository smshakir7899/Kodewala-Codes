package com.kodewala.inc2;

class ParkingLot
{
	int availableSpace = 3;

	public synchronized void carEntry(int num) throws InterruptedException
	{

		while (availableSpace == 0)
		{
			System.out.println("Car " + num + " waiting.....");
			wait();
			System.out.println(Thread.currentThread().getName() + "  resumed");
		}

		System.out.println("Car " + num + " entered");
		availableSpace = availableSpace - 1;
		System.out.println("Available: " + availableSpace);
		notify();

	}

	public synchronized void carExit() throws InterruptedException
	{
		while (availableSpace == 3)
		{

			wait();
		}

		availableSpace = availableSpace + 1;
		System.out.println("Car exited");
		System.out.println("Available space: " + availableSpace);
		notify();

	}

}

class CarEntryThread extends Thread
{

	ParkingLot lot;

	public CarEntryThread(ParkingLot lot)
	{
		super();
		this.lot = lot;
	}

	@Override
	public void run()
	{
		for (int i = 1; i < 7; i++)
		{
			try
			{
				lot.carEntry(i);
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class CarExitThread extends Thread
{
	ParkingLot lot;

	public CarExitThread(ParkingLot lot)
	{
		super();
		this.lot = lot;
	}

	public void run()
	{
		for (int i = 1; i < 7; i++)
		{
			try
			{
				lot.carExit();
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class Driver
{

	public static void main(String[] args)
	{
		ParkingLot lot = new ParkingLot();

		CarEntryThread entryThread = new CarEntryThread(lot);
		entryThread.setName("Entry");
		entryThread.start();

		CarExitThread exitThread = new CarExitThread(lot);
		exitThread.setName("Exit");
		exitThread.start();
	}

}
