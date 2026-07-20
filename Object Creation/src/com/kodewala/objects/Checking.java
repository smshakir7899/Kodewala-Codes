package com.kodewala.objects;


class Laptop
{
  String brand;
  int ram;
  
  Laptop (String brand, int ram)
  {
	  this.brand = brand;
	  this.ram = ram;
  }
  
  void dispay()
  {
	  System.out.println(brand);
	  System.out.println(ram + " GB");
  }
}

 class Checking
{
	public static void main(String args[])
	{
		Laptop l1 = new Laptop("Asus", 16);
		Laptop l2 = new Laptop("Lenovo", 8);
		
		l1.dispay();
		System.out.println();
		l2.dispay();
	}
}
