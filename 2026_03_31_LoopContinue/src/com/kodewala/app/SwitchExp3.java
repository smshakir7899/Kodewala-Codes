package com.kodewala.app;

public class SwitchExp3 
{

	public static void main(String[] args) 
	{
		int AtmOptions= Integer.parseInt(args[0]);
		
		switch (AtmOptions) {
		
		case 1:
			System.out.println("Check Balance");
			
			break;
			
		case 2:
			System.out.println("Withdraw");
			
			break;
			
		case 3:
			System.out.println("Deposit");
			
			break;
			
		case 4:
			System.out.println("Exit");
			
			break;

		default:
			System.out.println("Invalid option...retry.!!");
			break;
		}

	}

}
