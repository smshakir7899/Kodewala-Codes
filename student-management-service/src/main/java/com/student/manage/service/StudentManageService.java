package com.student.manage.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.student.StudentManagementServiceApplication;
import com.student.manage.entity.StudentEntity;
import com.student.manage.repository.StudentRepository;
import com.student.manage.request.StudentRequest;
import com.student.manage.response.StudentResponse;

@Service
public class StudentManageService
{

    private final StudentManagementServiceApplication studentManagementServiceApplication;
	@Autowired
	StudentRepository studentRepository;

    StudentManageService(StudentManagementServiceApplication studentManagementServiceApplication) {
        this.studentManagementServiceApplication = studentManagementServiceApplication;
    }

	public StudentResponse acceptRequest(StudentRequest studentRequest)
	{
		StudentEntity entity = new StudentEntity();
		entity.setStudentId(studentRequest.getStudentId());
		entity.setName(studentRequest.getName());
		entity.setAge(studentRequest.getAge());
		entity.setCourse(studentRequest.getCourse());
		entity.setEmail(studentRequest.getEmail());

		entity.setManageId(generateManageId());
		StudentEntity savedEntity = studentRepository.save(entity);

		StudentResponse response = new StudentResponse();
		response.setId(savedEntity.getId());
		response.setStudentId(savedEntity.getStudentId());
		response.setName(savedEntity.getName());
		response.setAge(savedEntity.getAge());
		response.setCourse(savedEntity.getCourse());
		response.setEmail(savedEntity.getEmail());

		return response;
	}

	private int generateManageId()
	{
		Random random = new Random();
		int id = 1000 + random.nextInt(9000);
		return id;
	}
}
