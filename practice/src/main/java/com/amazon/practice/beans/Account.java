package com.amazon.practice.beans;

public class Account
{
	private String accHolderName;
	private String ifsscCode;
	private String accNumber;

	public void getAccountDetails()
	{
		System.out.println("Account [accHolderName=" + accHolderName + ", ifsscCode=" + ifsscCode + ", accNumber="
				+ accNumber + "]");
	}

	public String getAccHolderName()
	{
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName)
	{
		this.accHolderName = accHolderName;
	}

	public String getIfsscCode()
	{
		return ifsscCode;
	}

	public void setIfsscCode(String ifsscCode)
	{
		this.ifsscCode = ifsscCode;
	}

	public String getAccNumber()
	{
		return accNumber;
	}

	public void setAccNumber(String accNumber)
	{
		this.accNumber = accNumber;
	}

}
