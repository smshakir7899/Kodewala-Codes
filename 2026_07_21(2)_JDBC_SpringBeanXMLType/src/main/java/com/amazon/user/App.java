package com.amazon.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.amazon.user.beans.Student;

public class App
{
	public static void main(String[] args)
	{
		String configFile = "com/amazon/user/beans.xml";

		ApplicationContext context = new ClassPathXmlApplicationContext(configFile);
		Student student = (Student) context.getBean("student1");

		student.setStudentName("Sayyed Shakir");
		student.setCourse("Java Backend");
		student.setCoaching("Kodewala Academy");
		student.displayStudentDetails();

	}
}
