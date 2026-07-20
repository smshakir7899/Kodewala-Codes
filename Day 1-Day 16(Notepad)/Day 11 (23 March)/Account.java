public class Account
{

	public static void main(String args[])
	{
		String input= args[0];
		int maxBalance=1000000;
		int minBalance=10000;
		
		int userBalance= Integer.parseInt(input);
		System.out.println("Input Balance:" +input);
		
		if(userBalance<=maxBalance && userBalance>=minBalance)
		{
			System.out.println("You are eligible for Bank Account");
		}
		
		else {
			System.out.println("Not eligible");
		}
	}


}