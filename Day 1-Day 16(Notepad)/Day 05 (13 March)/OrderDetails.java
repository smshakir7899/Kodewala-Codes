public class OrderDetails 
{
	public static void main(String args[])
	{
	String OrderId = args[0];
	String ItemName = args[1];
	String Price = args[2];
	String Quantity = args[3];
	String Status = args[4];
	String DeliveryAddress = args[5];
	
	System.out.println("Your order id is " +OrderId);
	System.out.println("Your item name is " +ItemName);
	System.out.println("Price for " +ItemName+ " is "+Price);
	System.out.println("Quantity of " +ItemName+ " is " +Quantity);
	System.out.println("Your order status is " +Status);
	System.out.println("Delivery Address for " +OrderId+ " is " +DeliveryAddress);
	
	}
}