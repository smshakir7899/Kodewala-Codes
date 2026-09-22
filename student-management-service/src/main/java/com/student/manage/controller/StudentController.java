package com.student.manage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.manage.request.StudentRequest;
import com.student.manage.response.StudentResponse;
import com.student.manage.service.StudentManageService;

@RestController
@RequestMapping("student/")
public class StudentController
{

	@Autowired
	StudentManageService studentManageService;

	@PostMapping("manage")
	public StudentResponse manageStudent(@RequestBody StudentRequest studentRequest)
	{
		System.out.println("StudentController.manageStudent()..........START");
		StudentResponse studentResponse = studentManageService.acceptRequest(studentRequest);
		System.out.println("StudentController.manageStudent()...........END");
		return studentResponse;
	}

}
