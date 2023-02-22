package com.example.CollegeMgt.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CollegeMgt.entities.Student;
import com.example.CollegeMgt.repository.StudentRepository;
import com.example.CollegeMgt.service.StudentService;
@Service
public class StudentServImpl implements StudentService {

	@Autowired
    StudentRepository sr;
	
	@Override
	public String insertStudent(Student s) {
		sr.save(s);
		return "Record inserted successfully!";
	}

	@Override
	public Student getStudent(int id) {
		
		return sr.findById(id).get();
	}

	@Override
	public List<Student> getAllStudents() {
		
		return sr.findAll();
	}

	@Override
	public String updateStudent(int id, Student s) {
		Student st=sr.findById(id).get();
		st=sr.save(s);
		return "Record updated successfully";
	}

	@Override
	public String deleteStudent(int id) {
		sr.deleteById(id);
		return "Record deleted successfully";
	}

}
