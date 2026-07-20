package com.kodewala.set;

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
    public boolean equals(Object obj2)
    {
    	Name test = (Name) obj2;
        return this.firstName.equals(test.firstName) && this.lastName.equals(test.lastName);
    }
    
    @Override
    public int hashCode()
    {
    	return 87678964;
    }
}

public class Driver1
{
    public static void main(String[] args)
    {
    	Name p1 = new Name("Sayyed", "Shakir");
    	Name p2 = new Name("Sayyed", "Shakir");

        System.out.println(p1.equals(p2)); // true
        
        //Earlier if we not override hash code then our first contract will break
        // (i.e. If two objects are equal then their hash code must be same)  
        System.out.println(p1.hashCode()+" "+p2.hashCode()); 
    }
}