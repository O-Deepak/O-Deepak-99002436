package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.student.exception.StudentNotFoundException;
import com.student.model.Student;
import com.student.service.StudentService;

//@RequestMapping("/student-api")
public class StudentController {
	@Autowired
	StudentService studentService;
	
	@PostMapping("/students")
	Student addStudent(@RequestBody Student student) {
		return studentService.addStudent(student);
	}
	@GetMapping("/students/get-one/{studentId}")
	Student getStudentById(Integer studentId) throws StudentNotFoundException{
		return studentService.getStudentById(studentId);
	}
	@GetMapping("/students/city/{city}")
	List<Student> getStudentByAddressCity(String city) throws StudentNotFoundException {
		return studentService.getStudentByAddressCity(city);
	}
	@GetMapping("/students/department/{department}")
	List<Student> getStudentByDepartment(String department) throws StudentNotFoundException{
		return studentService.getStudentByDepartment(department);
	}
	@GetMapping("/students")
	List<Student>getAllStudent(){
		return studentService.getAllStudent();
	}
	@GetMapping("/students/age/{age}")
		List<Student>findStudentByAge(@PathVariable("age")Integer age){
			return studentService.findStudentByAge(age);
		}
	}
	


