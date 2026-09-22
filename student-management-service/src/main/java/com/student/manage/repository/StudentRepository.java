package com.student.manage.repository;

import org.springframework.data.repository.CrudRepository;

import com.student.manage.entity.StudentEntity;

public interface StudentRepository extends CrudRepository<StudentEntity, Integer>
{

}
