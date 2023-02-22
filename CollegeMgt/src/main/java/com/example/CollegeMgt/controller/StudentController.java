package com.example.CollegeMgt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.CollegeMgt.entities.Student;
import com.example.CollegeMgt.service.StudentService;
@RestController
public class StudentController {
   
  @Autowired
  StudentService ss;
  
  @PostMapping("/student")
  public String insertStudent(@RequestBody Student s) {
  	
  	return ss.insertStudent(s);
  }
  
  @GetMapping("/student/{id}")
  public Student getStudent(@PathVariable int id) {
	 Student s=ss.getStudent(id);
	  return s;
  }
  
  @GetMapping("/students")
  public List<Student> getAllStudent() {
	  return ss.getAllStudents();
  }
  
  @PutMapping("/student/{id}")
  public String getStudent(@PathVariable int id,@RequestBody Student s) {
	  return ss.updateStudent(id,s);
  }
  @DeleteMapping("/student/{id}")
  public String deleteStudent(@PathVariable int id) {
	  return ss.deleteStudent(id);
  }
}
