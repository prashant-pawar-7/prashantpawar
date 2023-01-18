package com.springboothiber.service;

import java.util.List;

import org.springframework.stereotype.Component;
import com.springboothiber.dto.CourseDTO;
import com.springboothiber.entities.Courses;

@Component
public interface CourseService {                         //creating Course component class

	public Courses createCourse(CourseDTO ct);            //method to create a Course
	public Courses getCourse(int cid);                    //method to retrieve a Course
	public List<Courses> getAllCourse();                  //method to retrieve all the Courses
	public String updateCourse(int cid,CourseDTO ct);     //method to update a Course
	public String deleteCourse(int cid);                  //method to delete a Course
	public String deleteAllCourses();                     //method to delete all Courses
}
