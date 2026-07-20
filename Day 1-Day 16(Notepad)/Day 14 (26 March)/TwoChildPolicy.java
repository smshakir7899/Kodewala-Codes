class TwoChildPolicy
{
	
	public static void main(String args[])
	{
		TwoChildPolicy obj=new TwoChildPolicy();
		String input = args[0];
		int inputChild = Integer.parseInt(input);
		
		obj.eligibilityCheck(inputChild);
	}
	
	public void eligibilityCheck(int userChildren)
	{
		if(userChildren>0 && userChildren=<3)
		{
			System.out.println("Eligible for the policy");
		}
		else
		{
			System.out.println("Not Eligible for the policy");
		}
	}
}
