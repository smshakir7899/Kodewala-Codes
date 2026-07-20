package com.example.app.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.app.Account;
import com.example.app.TransferService;

public class TransferServiceTests
{
	TransferService service;
	Account sender;
	Account receiver;

	@BeforeEach
	public void setup()
	{
		service = new TransferService();
		sender = new Account("A122", "SBI", 5000);
		receiver = new Account("B1223", "HDFC", 2000);
	}

	@Test
	public void testSuccessfulTransfer()
	{
		assertTrue(service.transfer(sender, receiver, 1000));

		assertEquals(4000, sender.getBalance());

		assertEquals(3000, receiver.getBalance());
	}

	@Test
	public void testInsufficientBalance()
	{
		assertFalse(service.transfer(sender, receiver, 6000));

		assertEquals(5000, sender.getBalance());

		assertEquals(2000, receiver.getBalance());
	}

	@Test
	public void testZeroAmount()
	{
		assertFalse(service.transfer(sender, receiver, 0));
	}

	@Test
	public void testNegativeAmount()
	{
		assertFalse(service.transfer(sender, receiver, -500));
	}

	@Test
	public void testNullSender()
	{
		assertFalse(service.transfer(null, receiver, 1000));
	}

	@Test
	public void testNullReceiver()
	{
		assertFalse(service.transfer(sender, null, 1000));
	}
}
