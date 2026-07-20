package com.kodewala.str.junebatch.task;

public class QueryConstructor
{
	public static String QUERY = "select * from employee";

	public String constructQuery(String empId, int salary)
	{
		StringBuilder finalquery = new StringBuilder(QUERY);
		if (empId != null)
		{
			finalquery.append(" where empId " + empId);
		} else if (salary > 0)
		{
			finalquery.append("where salary > " + salary);

		}
		finalquery.append(";");

		return finalquery.toString();

	}
}
