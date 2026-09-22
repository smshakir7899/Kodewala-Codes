package com.amazon.user.beans;

public class Student
{

	String studentName;
	String course;
	String coaching;

	public void displayStudentDetails()
	{
		System.out.println("Student Name   : " + studentName);
		System.out.println("Student Course : " + course);
		System.out.println("Coaching Name  : " + coaching);
	}

	public String getStudentName()
	{
		return studentName;
	}

	public void setStudentName(String studentName)
	{
		this.studentName = studentName;
	}

	public String getCourse()
	{
		return course;
	}

	public void setCourse(String course)
	{
		this.course = course;
	}

	public String getCoaching()
	{
		return coaching;
	}

	public void setCoaching(String coaching)
	{
		this.coaching = coaching;
	}

}
