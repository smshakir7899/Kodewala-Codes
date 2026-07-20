package com.kodewala.app;

public class SwitchExp4
{

	public static void main(String[] args)
	{
		String connectionName = args[0];
	 switch (connectionName) {
	case "D":
		System.out.println("Domestic Connection");
		
		break;
		
	case "C":
		System.out.println("Commercial Connection");
		
		break;
		
	case "I":
		System.out.println("Industrial Connection");
		
		break;
		
	case "A":
		System.out.println("Agricultural Connection");
		
		break;

	default:
		System.out.println("Invalid Connection Type");
		
		break;
	}

	}

}
