package com.example.app.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.example.app.AttendanceChecker;

public class AttendanceCheckerTests
{
	static AttendanceChecker checker;

	@BeforeAll
	public static void beforeAll()
	{
		checker = new AttendanceChecker();
	}

	@Test
	public void testAttendanceChecker()
	{
		assertEquals("Allowed", checker.getAttendanceStatus(80));
	}

	@Test
	public void testAttendanceChecker1()
	{
		assertEquals("Warning", checker.getAttendanceStatus(65));
	}

	@Test
	public void testAttendanceChecker2()
	{
		assertEquals("Not Allowed", checker.getAttendanceStatus(45));
	}
}
