package com.kodewala.override;

import java.util.HashSet;

class BalanceTree
{
	String str;
	
	  public BalanceTree(String str)
	{
		super();
		this.str = str;
	}
 
	  @Override
	  public boolean equals(Object obj)
	    { 
	        return this == obj;
	    }

	  @Override
	public int hashCode()
	{
		return 1234321;
	} 
}

public class Driver2
{

	public static void main(String[] args)
	{
		HashSet<BalanceTree> list = new HashSet<BalanceTree>(64);
		
		BalanceTree b1 = new BalanceTree("Jodhpur1");
		BalanceTree b2 = new BalanceTree("Jodhpur2");
		BalanceTree b3 = new BalanceTree("Jodhpur3");
		BalanceTree b4 = new BalanceTree("Jodhpur4");
		BalanceTree b5 = new BalanceTree("Jodhpur5");
		BalanceTree b6 = new BalanceTree("Jodhpur6");
		BalanceTree b7 = new BalanceTree("Jodhpur7");
		BalanceTree b8 = new BalanceTree("Jodhpur8");
		BalanceTree b9 = new BalanceTree("Jodhpur9");
		
		
		
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);
		list.add(b6);
		list.add(b7);
		list.add(b8);
		System.out.println(list.size()); 
		
		
		list.add(b9);
		System.out.println(list.size());
		
		list.remove(b1);
		list.remove(b2);
		list.remove(b3);
		list.remove(b4);
		list.remove(b5);
		list.remove(b6);
		list.remove(b7);
		
 		System.out.println(list.size());
		
		
	}

}
