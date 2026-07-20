class KodewalaAcademyFee
{
	public static void main(String args[])
	{
		KodewalaAcademyFee fee=new KodewalaAcademyFee();
		String input= args[0];
		int inputFee = Integer.parseInt(input);
		fee.feeStructure(inputFee);
	}
	
	public void feeStructure(int inputFee)
	{
		if(inputFee==7500)
		{
			System.out.println("You are only eligible for recorded lectures");
		}
		else if(inputFee>7500 && inputFee<15000){
			System.out.println("You are only eligible for online batch");
		}else if (inputFee>=15000 && inputFee<30000){
			System.out.println("You are eligible for offline batch, but after complete payment of full fee.");
		}else if (inputFee>=30000)
		{
			System.out.println("You are eligible for offline batch.");
		}
		else
		{
			System.out.println("Not eligible for any batch");
		}
	}
}
