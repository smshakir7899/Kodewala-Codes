public class Discount
{
	public static void main(String args[])
	{
		
		String input =args[0];
		String inputAccount =args[1];
		
		System.out.println("Item Price: "+input);
		System.out.println("Account Type: "+inputAccount);
		
		int minAmount=1000;
		int itemPrice= Integer.parseInt(input);
		
		if(itemPrice>=minAmount || inputAccount.equals("Gold"))
		{
		System.out.println("Discount Applicable");
		}
		
		else
		{
			System.out.println("Discount Not Applicable");
		}
	}
}