package com.example.app;

public class AttendanceChecker
{
	public String getAttendanceStatus(int percentage)
	{
		if (percentage >= 75)
		{
			return "Allowed";
		} else if (percentage >= 60)
		{
			return "Warning";
		}
		return "Not Allowed";
	}
}

