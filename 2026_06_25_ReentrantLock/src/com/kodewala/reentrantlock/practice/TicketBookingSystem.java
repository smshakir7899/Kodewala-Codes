package com.kodewala.reentrantlock.practice;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock; 

class MovieTheatre
{
	private int availableTickets = 5;
	ReentrantLock reentrantLock = new ReentrantLock();

	public void bookTicket(int count) throws InterruptedException
	{
		boolean lockStatus = reentrantLock.tryLock(3, TimeUnit.SECONDS);

		if (lockStatus)
		{
			try
			{
				System.out.println(Thread.currentThread().getName() + " Hold Count: " + reentrantLock.getHoldCount());
				if (count <= availableTickets)
				{
					System.out.println(Thread.currentThread().getName() + " is booking " + count);
					Thread.sleep(2000);
					availableTickets = availableTickets - count;
					System.out.println(Thread.currentThread().getName() + " completed booking. Remaining tickets: "
							+ availableTickets);
				} else
				{
					System.out.println(Thread.currentThread().getName() + " found that not enough tickets available");
				}
			} finally
			{
				reentrantLock.unlock();
				System.out.println(Thread.currentThread().getName() + " released lock");
			}

		} else
		{

			System.out.println(Thread.currentThread().getName() + " is not acquiring lock within 3 seconds");
		}
	}

	public int getAvailableTickets()
	{
		return availableTickets;
	}

}

class Customer2 extends Thread
{
	private final MovieTheatre account;
	int ticket;

	public Customer2(MovieTheatre account, String name, int ticket)
	{
		super(name);
		this.account = account;
		this.ticket = ticket;
	}
	
	@Override
	public void run()
	{
		try
		{
			account.bookTicket(ticket);
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	

}

public class TicketBookingSystem
{

	public static void main(String[] args) throws InterruptedException
	{
		MovieTheatre theatre = new MovieTheatre();
		System.out.println("Initially Available Tickets: "+theatre.getAvailableTickets());
		Customer2 c1 = new Customer2(theatre, "Shakir", 3);
		Customer2 c2 = new Customer2(theatre, "Faisal", 4);
		
		c1.start();
		c2.start();
		
		c1.join();
		c2.join();
		System.out.println("Final tickets: "+theatre.getAvailableTickets());
	}

}
