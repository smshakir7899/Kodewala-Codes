package com.kodewala.methodoverloading;

class SalaryCalculation
{
	public void calculateSalary(int basicSalary)
	{
		System.out.println("Salary: " + basicSalary);
	}
	
	public void calculateSalary(int basicSalary, int bonus)
	{
		System.out.println("Salary with Bonus: " + (basicSalary + bonus));
	}
	
	public void calculateSalary( int basicSalary, int bonus, int incentive)
	{
		System.out.println("Salary with Bonus & Incentive : " + (basicSalary + bonus + incentive));
	}
}

public class Driver1
{

	public static void main(String[] args)
	{
		SalaryCalculation sal = new SalaryCalculation();
		
		sal.calculateSalary(50000);
		sal.calculateSalary(50000, 20000);
		sal.calculateSalary(50000, 20000, 10000);
	}

}
