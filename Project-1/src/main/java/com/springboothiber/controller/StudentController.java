package com.springboothiber.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboothiber.dto.StudentDTO;
import com.springboothiber.entities.Student;
import com.springboothiber.exception.UserNotFoundException;
import com.springboothiber.service.StudentService;

//Student Controller Class
@RestController
public class StudentController {

	//instance of Student service
	@Autowired(required=true)
	StudentService ss;

	//Post mapping to create a student
	@PostMapping("/student")
	public ResponseEntity<Student> createStudent(@RequestBody @Valid StudentDTO std)
	{
		try
		{
		 Student s = ss.createStudent(std);
		 if(s!=null)
			return new ResponseEntity<Student>(s,HttpStatus.CREATED);
		}
		catch(Exception e)
		{
			throw new UserNotFoundException("Student not created! Enter proper Student details");
		}
		return new ResponseEntity<Student>(HttpStatus.BAD_REQUEST);
	}
	
	
	//Get mapping to retrieve a student
	@GetMapping("/student/{sid}")
	public ResponseEntity<Student> getStudent(@PathVariable("sid") int sid )
	{
		 try
		 {
		  Student s=ss.getStudent(sid);
		  if(s!=null)
			 return new ResponseEntity<Student>(s,HttpStatus.FOUND);
		 }
		 catch(Exception e)
		 {
			 throw new UserNotFoundException("Student not found please enter valid id");
		 }
		 return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
	}
	
	
	//Get mapping to retrieve all the students
	@GetMapping("/students")
	public ResponseEntity<List<Student>> getAllStudents()
	{
		try
		{
		 List<Student> s=ss.getAllStudents();
		 if(s!=null)
			return new ResponseEntity<List<Student>>(s,HttpStatus.FOUND);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return new ResponseEntity<List<Student>>(HttpStatus.NOT_FOUND);
	}
	
	
	//Put mapping to update a student
	@PutMapping("/student/{sid}")
	public ResponseEntity<String>UpdateStudent(@PathVariable("sid") int sid,@RequestBody @Valid StudentDTO st)
	{
		try
		{
		 String s=ss.updateStudent(sid, st);
		 if(s!=null)
			return new ResponseEntity<String>(s,HttpStatus.ACCEPTED);
		}
		catch(Exception e)
		{
			throw new UserNotFoundException("Student not found! Enter valid details to update Student");
		}
		return new ResponseEntity<String>(HttpStatus.NOT_MODIFIED);		
	}
	
	
	//Delete mapping to delete a student
	@DeleteMapping("/student/{sid}")
	public ResponseEntity<String> deleteStudent(@PathVariable("sid") int sid)
	{
		try
		{
		 String s=ss.deleteStudent(sid);
		 if(s!=null)
			return new ResponseEntity<String>(s,HttpStatus.ACCEPTED);
		}
		catch(Exception e)
		{
			throw new UserNotFoundException("Student not found! Enter valid id to delete");
		}
		return new ResponseEntity<String>(HttpStatus.NOT_ACCEPTABLE);		
	}
	
	
	//Delete mapping to delete all the students
	@DeleteMapping("/students")
	public ResponseEntity<String> deleteAllStudent()
	{
		try
		{
		 String s=ss.deleteAllStudents();
		 if(s!=null)
			return new ResponseEntity<String>(s,HttpStatus.ACCEPTED);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return new ResponseEntity<String>(HttpStatus.NOT_ACCEPTABLE);		
	}
}

