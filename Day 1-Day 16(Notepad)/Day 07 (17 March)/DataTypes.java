class DataTypes
{
	static byte b; // 1 byte ---> 8 bit 
	static short s; // 1short---> 2 byte 
	static int x; // 1 int ---> 4 byte & default is 0
	static boolean status; // default is false
	static char alpha; // default unicode --> 'U00000' 
	static float k; // default 0.0
	// If we do not  assign any value of them in main method then they use their default value.
	public static void main(String args[])
	{
		b=123;
		s= 12321;
		x= 123321;
		status=true;
		alpha = 'C';
		k = 2.4f;
		
		System.out.println("Amount: " +x);
		System.out.println("Total Amount: " +x+s+b);
		System.out.println("Does Java 25 has try with resource feature: " +status);
		
	}
}