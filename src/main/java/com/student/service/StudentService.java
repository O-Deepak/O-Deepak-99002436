package com.student.service;

import java.util.List;

import com.student.exception.StudentNotFoundException;
import com.student.model.Student;

public interface StudentService {
	Student addStudent(Student student);
	Student getStudentById(Integer studentId) throws StudentNotFoundException;
	List<Student>getAllStudent();
	List<Student> getStudentByAddressCity(String city) throws StudentNotFoundException;
	List<Student> getStudentByDepartment(String department) throws StudentNotFoundException;
	List<Student>findStudentByAge(Integer age);
	
	
	
	

}
