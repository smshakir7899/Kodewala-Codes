public class OrderItem
{
	String itemName="iPhone";
	int price=123000; // Member Variable (As declared inside a class and outside any method)
	
	public static void main(String args[])
	{
			OrderItem orderItem = new OrderItem(); //Creating an object of the OrderItem class
			
			orderItem.displayDetails(); // Accessing the member variables using the object
	}
	
	
			public void displayDetails() // Method to display orderItem details
	
	{	
			System.out.println("Item name: "+itemName);
			System.out.println("Price: "+price);
	}
}