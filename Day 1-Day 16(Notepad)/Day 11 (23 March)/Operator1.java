class Operator1
{
	public static void main(String args[])
	{
		String name="Shakir";
		System.out.println(name);
		
		String input =args[0];
		System.out.println("Input Balance:\t"+input);
		
		int minBalance =10000;
		int userBalance= Integer.parseInt(input);
		
		if(userBalance>=minBalance)//MISTAKE---> Do not use ";" after if statement.
		{
		System.out.println("Eligible for account opening");
		}
		
		else
		{
			System.out.println("Not Eligible");
		}
	}
}