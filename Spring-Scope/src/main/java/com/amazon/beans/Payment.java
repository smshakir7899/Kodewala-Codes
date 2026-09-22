package com.amazon.beans;

public class Payment
{

	private String refID;

	public void showPaymentDetails()
	{
		System.out.println("REF ID: " + refID);
	}

	public String getRefID()
	{
		return refID;
	}

	public void setRefID(String refID)
	{
		this.refID = refID;
	}
}
