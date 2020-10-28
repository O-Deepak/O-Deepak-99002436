package com.student.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "student")
@TypeAlias("Student")

public class Student {
	@Id
	Integer studentId;
	String name,department;
	Integer age;
	@Autowired
	Address address;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(Integer studentId, String name, String department, Integer age, Address address ) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.department = department;
		this.age = age;
		this.address=address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", department=" + department + ", age=" + age
				+ ", address=" + address + "]";
	}
	
	

}
