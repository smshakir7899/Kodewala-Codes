class LearnMethod3
{
	
	String checkEligibility(int age)
	{
		if (age>=18)
		{
			return "Eligible for voting";
		}
		else
		{
			return "Not Eligible";
		}
	}
	
	public static void main(String args[])
	{
		LearnMethod3 obj= new LearnMethod3();
		int age = Integer.parseInt(args[0]);
		String result= obj.checkEligibility(age);
		
		System.out.println(result);
	}
	
}