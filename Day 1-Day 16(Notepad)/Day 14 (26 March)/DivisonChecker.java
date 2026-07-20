class DivisonChecker
{
	public static void main(String args[])
	{
		DivisonChecker div = new DivisonChecker();
		String input = args[0];
		int inputPercentage = Integer.parseInt(input);
		
		div.calculateDivison(inputPercentage);
	}
	
	public void calculateDivison(int inputPercentage)
	{
		if(inputPercentage=<100 && inputPercentage>=60)
		{
			System.out.println("You have passed the exam with First Divison");
		}else if (inputPercentage<60 && inputPercentage>=45){
			System.out.println("You have passed the exam with Second Divison");
		}else if (inputPercentage<45 && inputPercentage>=36){
			System.out.println("You have passed the exam with Third Divison");
		}else if (inputPercentage<36 && inputPercentage>=0){
			System.out.println("Failed..!!");
		}else 
		{
			System.out.println("Invalid input..");
		}
	}
}