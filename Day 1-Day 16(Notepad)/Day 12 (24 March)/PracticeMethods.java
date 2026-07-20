class PracticeMethod
{
	// Task or Work
	/**for e.g.
	get a coffee---->Task
	get a coffee (int money, String quantity) ---> money and quantity are inputs
	{
	(here logic comes i.e. go and order the coffee then recieve, etc.)
	then output i.e. return	
	}
	*/
	
	int addNumbers(int firstNum, int secondNum)
	{
		int sum= firstNum + secondNum;
		return sum;
	}
	public static void main(String args[]) // Creating the method that print the message or do the sum
	{
		PracticeMethod m = new PracticeMethod(); //Creating object of class PracticeMethod
	
		int result =m.addNumbers(12,12);  // Calling the method
		
		System.out.println(result);
	}

}