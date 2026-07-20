class ShippingCost
{
	public static void main(String args[])
	{
		int inputAmount = Integer.parseInt(args[0]);
		if (inputAmount>5000)
		{
			System.out.println("Wow.!! You Have Unlocked Free Shipping");
		}else if (inputAmount<=5000 && inputAmount>=2000){
			System.out.println("Shipping Fees: 100");
		}else if (inputAmount<2000){
			System.out.println("Shipping Fees: 200");
		}
	}
}