class VoterCard1
{

	public static void main(String args[])
	{
		VoterCard1 ageChecker= new VoterCard1();
		
		String input = args[0];
	
		int userAge= Integer.parseInt(input);
		ageChecker.validateCart(userAge);
	}

	public void validateCart(int userAge)
	{
		if (userAge>18 && userAge<100)
		{
			System.out.println("Eligible for VoterCard");
		}
		else
		{
			System.out.println("Not Eligible");
		}
	}
}
