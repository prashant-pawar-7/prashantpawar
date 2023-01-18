package com.springboothiber.serviceimpl;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboothiber.dto.CourseDTO;
import com.springboothiber.entities.Courses;
import com.springboothiber.repositories.CourseRepository;
import com.springboothiber.service.CourseService;

//Creating Courses Service class
//Service class implementing Component class
@Service
public class CourseServiceImpl implements CourseService{

	//instace of Repository class of course
	@Autowired
	CourseRepository cr;         
	
	//method to create a Course
	@Override
	public Courses createCourse(CourseDTO ct) 
	{
		Courses c=Courses.builder()
				 .cid(ct.getCid())
				 .cname(ct.getCname())
				 .cduration(ct.getCduration())
				 .cfees(ct.getCfees())
				 .build();
		return cr.save(c);
	}

	//method to retrieve a Course
	@Override
	public Courses getCourse(int cid) 
	{
		return cr.findById(cid).get();
	}

	//method to retrieve all the Courses
	@Override
	public List<Courses> getAllCourse() 
	{	
		return cr.findAll();
	}

	//method to update a Course
	@Override
	public String updateCourse(int cid, CourseDTO ct) 
	{	
		@SuppressWarnings("unused")
		Courses c=cr.findById(cid).get();
		Courses c1=Courses.builder()
				   .cid(cid)
				   .cname(ct.getCname())
				   .cduration(ct.getCduration())
				   .cfees(ct.getCfees())
				   .build();			 
		cr.save(c1);
		return "Record Updated Successfully...";
	}

	//method to delete a Course
	@Override
	public String deleteCourse(int cid) 
	{
		cr.deleteById(cid);
		return "Record Deleted Successfully...";
	}

	//method to delete all Courses
	@Override
	public String deleteAllCourses() 
	{
		cr.deleteAll();
		return "All Records are Deleted Successfully...";
	}

}
