package com.springboothiber.controller;

import java.util.List;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboothiber.dto.CourseDTO;
import com.springboothiber.entities.Courses;
import com.springboothiber.exception.UserNotFoundException;
import com.springboothiber.service.CourseService;

//Course Controller Class
@RestController
@CrossOrigin
public class CoursesController {

	//instance of Course service
	@Autowired(required=true)
	CourseService cs;
	
	//Post mapping to create a Course
	@PostMapping("/course")
	public ResponseEntity<Courses> createCourse(@RequestBody @Valid CourseDTO ctd)
	{
		try
		{
		 Courses c = cs.createCourse(ctd);
		 if(c!=null)
			return new ResponseEntity<Courses>(c,HttpStatus.CREATED);
		}
		catch(Exception e)
		{
			throw new UserNotFoundException("Course not created! Enter proper course details");
		}
		return new ResponseEntity<Courses>(HttpStatus.BAD_REQUEST);
	}
	
	
	//Get mapping to retrieve a student
	@GetMapping("/course/{cid}")
	public ResponseEntity<Courses> getCourse(@PathVariable("cid") int cid)
	{
		try
		{
		 Courses c=cs.getCourse(cid);
		 if(c!=null)
			 return new ResponseEntity<Courses>(c,HttpStatus.FOUND);
		}
		catch(Exception e)
		{
			throw new UserNotFoundException("Course not found enter valid id");
		}
		 return new ResponseEntity<Courses>(HttpStatus.NOT_FOUND);
	}
	
	
	//Get mapping to retrieve a Course
	@GetMapping("/courses")
	public ResponseEntity<List<Courses>> getAllCourses()
	{
		try
		{
		 List<Courses> c=cs.getAllCourse();
		 if(c!=null)
			return new ResponseEntity<List<Courses>>(c,HttpStatus.OK);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return new ResponseEntity<List<Courses>>(HttpStatus.NOT_FOUND);
	}
	
	
	//Put mapping to update a Course
	@PutMapping("/course/{cid}")
	public ResponseEntity<String>UpdateCourse(@PathVariable("cid") int cid, @RequestBody @Valid CourseDTO ctd)
	{
		try
		{
		 String c=cs.updateCourse(cid,ctd);
		 if(c!=null)
			return new ResponseEntity<String>(c,HttpStatus.ACCEPTED);
		}
		catch(Exception e)
		{
			throw new UserNotFoundException("Course not found! Enter valid id to update course");
		}
		return new ResponseEntity<String>(HttpStatus.NOT_MODIFIED);		
	}
	
	
	//Delete mapping to delete a Course
	@DeleteMapping("/course/{cid}")
	public ResponseEntity<String> deleteCourse(@PathVariable("cid") int cid)
	{
		try 
		{
		 String s=cs.deleteCourse(cid);
		 if(s!=null)
			return new ResponseEntity<String>(s,HttpStatus.ACCEPTED);
		}
		catch(Exception e)
		{
			throw new UserNotFoundException("Course not found! Enter valid id to delete");
		}
		return new ResponseEntity<String>(HttpStatus.NOT_ACCEPTABLE);		
	}
	
	
	//Delete mapping to delete all the Courses
	@DeleteMapping("/courses")
	public ResponseEntity<String> deleteAllCourses()
	{
		try
		{
		 String s=cs.deleteAllCourses();
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
