class PaymentInfo
{
	
	static int transfer; //Declaration of varible
	static int value = 454; //Both Declaration as well as initalization
	public static void main(String args[])
	
	{
		int balance = 1000; //Local varible (All varible which are inside the main method are local variables).
		int transfer = 400; // Assigning the value
		String name = "Sayyed";
		boolean paymentSucessful = true;
		float taxForPayment = 2.8f;
		balance = balance + 200; //Changing the value
		float sum = balance - (transfer+taxForPayment);
		
		System.out.println("Inital Balance: " +balance);
		System.out.println("Transfer: " +transfer);
		System.out.println("Tax for transfer: " +taxForPayment);
		System.out.println("Payment Succesful: " +paymentSucessful);
		System.out.println("Remaining Balance: " +sum);
	
	}
	
}