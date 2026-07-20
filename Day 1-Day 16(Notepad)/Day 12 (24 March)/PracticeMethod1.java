class PracticeMethod1
{
	int addNumbers(int firstNum, int secondNum)
	{
		int	sum= firstNum + secondNum;
		return sum;
	}	

	public static void main(String args[])
	{
		PracticeMethod1 p= new PracticeMethod1();
		int result = p.addNumbers(1344,1231);
		System.out.println(result);
	}
}