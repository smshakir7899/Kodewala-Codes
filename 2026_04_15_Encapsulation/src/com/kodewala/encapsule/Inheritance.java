package com.kodewala.encapsule;


class Parent // parent of child class
{
	String name = "Sayyed";
	public void doFundTransfer()
	{
		System.out.println("Parent.doFundTransfer()");
	}
}

class Child extends Parent // child of Parent class 
{
	public void pay()
	{
		System.out.println(name);
		doFundTransfer();
		
		//There is no need of below codes i.e. creating new child is uneccesasry
		//Child obj = new Child();
		//System.out.println(obj.name);
		//obj.doFundTransfer();
		
	}
}

public class Inheritance   
{

	public static void main(String[] args)
	{
		Child child = new Child();
		child.doFundTransfer();
	}

}
