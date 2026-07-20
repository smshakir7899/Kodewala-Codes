class LocalVariable
{
	public static void main(String args[])
	{
		int x=10; // It is a local variable --> it always defines inside the main method or constructor
	}
}


class StaticVariable
{
	static int y; // Static variable (Outside the main method) ---> Also it is only declaration
	
	static short w=12; // Both declaring and assigning
	public static void main(String args[])
	{
		int y=10;
	}
}


class InstanceVariable
{
	String name; //Instance Variable (Outside the main method) ---> Also it is only declaration
	
	public static void main(String args[])
	{
		InstanceVariable s1= new InstanceVariable(); 
		/**Creating the objecy -->
		Class name =InstanceVariable, refrence variable = s1, Allocates memory =new, creates object =InstanceVariable
		*/
		
		s1.name = "Sayyed";
		System.out.println("Name: "+s1.name); 
		//Using the instance variable 
		
		
	}
}