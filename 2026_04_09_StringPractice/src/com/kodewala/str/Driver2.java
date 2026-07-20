package com.kodewala.str;

public class Driver2
{

	public static void main(String[] args)
	{
		String s1 = "java";
		String s2 = "java";

		String s3 = new String("java");

		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		System.out.println(s1.equals(s3));

		String s4 = new String("java"); // it creates 2 object one in heap as new keyword is used and 1 in SCP as we are
										// assuming that there is no "java" present in SCP
		String s5 = new String("java"); // now this one create only 1 object i.e. 1 in Heap only as new keyword used and
										// nothing in SCP as "java" already created in previous line

		System.out.println(s4 == s5);
		System.out.println(s4.equals(s5));

	}

}
