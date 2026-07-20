class RelationalOperator
{

	public static void main(String args[])
	{
		String input = args[0];
		System.out.println("User input in String: "+input);
		int minAge=18;
		int userAge = Integer.parseInt(input); //Converting String to integer

		System.out.println(userAge>minAge);
		
	}		
}