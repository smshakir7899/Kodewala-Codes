class OddEvenChecker
{
	public static void main(String args[])
	{
		OddEvenChecker obj = new OddEvenChecker();
		
		/*String input = args[0];
		int inputNumber = Integer.parseInt(input);*/
		//Why to write 2 diffrent lines of code when you can write in single line.
		int inputNumber = Integer.parseInt(args[0]);
		obj.numberCheck(inputNumber);
	}
	
	public void numberCheck(int inputNumber)
	{
		if(inputNumber %2==0)
		{
			System.out.println("Inputed Number is Even");
		}
		else
		{
			System.out.println("Inputed Number is Odd");
		}
	}
}