public class Addition1
{
	public static void main (String args[])//command line is always in string.
	{
		if(args.length==2) //double equals means compare whereas single means assign
		{
		int a=Integer.parseInt(args[0]); // this code i.e. parseInt is used to convert String --> Integer 
		int b=Integer.parseInt(args[1]); // if we not convert then, for e.g. if input is 20 20 then the output will be 2020 instead of 40
		
		System.out.println(a+b);
		}
		else{
		System.out.println("Invalid input...."); 
		}
	}
}