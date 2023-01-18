package com.springboothiber.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.springboothiber.dto.StudentDTO;
import com.springboothiber.entities.Student;

@Component
public interface StudentService {                         //Creating Student component class

	public Student createStudent(StudentDTO st);           //method to create a Student
	public Student getStudent(int id);                     //method to retrieve a Student
	public List<Student> getAllStudents();                 //method to retrieve all the Students
	public String updateStudent(int id,StudentDTO st);     //method to update a Student
	public String deleteStudent(int id);                   //method to delete a Student
	public String deleteAllStudents();                     //method to delete all Students
}
