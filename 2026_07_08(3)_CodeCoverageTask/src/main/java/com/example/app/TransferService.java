package com.example.app;

public class TransferService
{
	public boolean transfer(Account sender, Account receiver, double amount)
	{
		if (sender == null || receiver == null)
		{
			return false;
		} else if (amount <= 0)
		{
			return false;
		} else if (sender.getBalance() < amount)
		{
			return false;
		}

		sender.setBalance(sender.getBalance() - amount);
		receiver.setBalance(receiver.getBalance() + amount);
		return true;
	}
}
