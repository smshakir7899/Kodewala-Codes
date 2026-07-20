class VoterCard 
{
	
	public static void main(String args[])
	{
		VoterCard obj= new VoterCard();
		
		String personAgeStr = args[0];
		int personAge= Integer.parseInt(personAgeStr);
		obj.validateCard(personAge);
	}
	
	public void validateCard(int age)
	{
		if (age>18)
		{
			System.out.println("Eligible for voter id");
		}
		else
		{
			System.out.println("Not Eligible");
		}
	}
}