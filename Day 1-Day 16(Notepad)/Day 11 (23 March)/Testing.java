class Testing
{
	public static void main(String args[])
	{
		String input =args[0];
		
		System.out.println("Input Age: "+input);
		int minAge=18;
		int maxAge=100;
		int userAge =Integer.parseInt(input);
		
		if (userAge>minAge && userAge<maxAge)
		{
			System.out.println("Eligible for applying voter id card");
		}
		else
		{
			System.out.println("Not Eligible");
		}
	}
}