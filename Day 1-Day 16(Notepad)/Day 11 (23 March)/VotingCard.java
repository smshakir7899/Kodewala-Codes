public class VotingCard
{
	public static void main(String args[])
	{
		
		String input =args[0];
		System.out.println("Input Age:\t"+input);
		
		int minAge=18;
		int maxAge=100;
		int userAge= Integer.parseInt(input);
		
		if(userAge>=minAge && userAge<=maxAge)//MISTAKE---> Do not use ";" after if statement.
		{
		System.out.println("Eligible for Voting Card");
		}
		
		else
		{
			System.out.println("Not Eligible");
		}
	}
}