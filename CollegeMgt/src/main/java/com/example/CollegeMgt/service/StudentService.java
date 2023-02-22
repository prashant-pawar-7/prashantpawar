package com.example.CollegeMgt.service;

import java.util.List;

import com.example.CollegeMgt.entities.Student;

public interface StudentService {
  
	public String insertStudent(Student s);
  
    public Student getStudent(int id);
    
    public List<Student> getAllStudents();
    
    public String updateStudent(int id,Student s);
    
    public String deleteStudent(int id);
}
