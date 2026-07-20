class Cart
{

	public static void main(String args[])
	{
		Cart cart= new Cart();
		cart.validateCart(7);
	}

	public void validateCart (int quantity)
	{
		if (quantity < 10)
		{
			System.out.println("Allowed to place an order");
		}
	}
}

