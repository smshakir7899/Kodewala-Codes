public class Addition 
	{
	public static void main(String args[])
	{
		if(args.length ==2){
	int firstNumber = Integer.parseInt(args[0]);
	int secondNumber = Integer.parseInt(args[1]);
	
	
	int Sum = firstNumber+secondNumber;
	
	System.out.println("The sum is: " + Sum);
		}
		 else{
			System.out.println("Give proper input." ); 
		 }
	}
}