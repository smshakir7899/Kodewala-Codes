public class Addition2
	{
	public static void main(String args[])
		{
		if (args.length!=2)//!-->this shows unequality sign
		{
		System.out.println("Invalid input...");
		return;
		}
		int x= Integer.parseInt(args[0]);
		int y= Integer.parseInt(args[1]);
		
		System.out.println(x+y);
	}
}