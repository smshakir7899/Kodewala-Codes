class ForLoopExample1
{
	public static void main(String args[])
	{
		ForLoopExample1 prt= new ForLoopExample1();
		prt.printNumbers();
	}

	void printNumbers()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println("Current Sequence: "+i);
		}
	}
}
