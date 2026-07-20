package com.kodewala.hashmap;

import java.util.HashMap;

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
		return 3432434;
	}
	
}
public class Driver3
{

	public static void main(String[] args)
	{
		HashMap<BalanceTree, String> balanceTree = new HashMap<BalanceTree, String>(64);
		
		BalanceTree b1 = new BalanceTree("Raj1");
		BalanceTree b2 = new BalanceTree("Raj2");
		BalanceTree b3 = new BalanceTree("Raj3");
		BalanceTree b4 = new BalanceTree("Raj4");
		BalanceTree b5 = new BalanceTree("Raj5");
		BalanceTree b6 = new BalanceTree("Raj6");
		BalanceTree b7 = new BalanceTree("Raj7");
		BalanceTree b8 = new BalanceTree("Raj8");
		BalanceTree b9 = new BalanceTree("Raj9");
		
		balanceTree.put(b1, "JDP1");
		balanceTree.put(b2, "JDP2");
		balanceTree.put(b3, "JDP3");
		balanceTree.put(b4, "JDP4");
		balanceTree.put(b5, "JDP5");
		balanceTree.put(b6, "JDP6");
		balanceTree.put(b7, "JDP7");
		balanceTree.put(b8, "JDP8");
		System.out.println(balanceTree.size());
		
		
		balanceTree.put(b9, "JDP9");
		System.out.println(balanceTree.size());
		
		balanceTree.remove(b1);
		balanceTree.remove(b2);
		balanceTree.remove(b3);
		balanceTree.remove(b4);
	}

}
