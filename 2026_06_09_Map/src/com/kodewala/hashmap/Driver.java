package com.kodewala.hashmap;

class Name
{
	String firstName;
	String lastName;
	
	public Name(String firstName, String lastName)
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	@Override
	public boolean equals(Object obj1)
	{
		Name test = (Name) obj1;
		return this.firstName.equals(test.firstName) && this.lastName.equals(test.lastName);
	}
	
	@Override
	public int hashCode()
	{
		return 56463433;
	}
}
public class Driver
{

	public static void main(String[] args)
	{
		Name p1 = new Name("Sayyed", "Shakir");
		Name p2 = new Name("Sayyed", "Faisal");
		
		System.out.println(p1.equals(p2));
		System.out.println(p1.hashCode() + " and " + p2.hashCode());
		
	}

}
