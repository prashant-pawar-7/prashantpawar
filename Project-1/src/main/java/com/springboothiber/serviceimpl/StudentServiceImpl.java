package com.springboothiber.serviceimpl;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboothiber.dto.StudentDTO;
import com.springboothiber.entities.Student;
import com.springboothiber.repositories.StudentRepository;
import com.springboothiber.service.StudentService;

//Creating Student Service class
//Service class implementing Component class
@Service
public class StudentServiceImpl implements StudentService{

	//instace of Repository class of Student
	@Autowired
	StudentRepository sr;    
	
	//method to create a Student
	@Override
	public Student createStudent(StudentDTO st) 
	{
	    Student s= Student.builder()
	    		.sname(st.getSname())
	    		.sage(st.getSage())
	    		.scontact(st.getScontact())
	    		.scourse(st.getScourse())
	    		.build();
		return sr.save(s);
	}

	//method to retrieve a Student
	@Override
	public Student getStudent(int id) 
	{
		return sr.findById(id).get();
	}

	//method to retrieve all the Students
	@Override
	public List<Student> getAllStudents() 
	{		
		return sr.findAll();
	}

	//method to update a Student
	@Override
	public String updateStudent(int id, StudentDTO st) 
	{
		@SuppressWarnings("unused")
		Student s=sr.findById(id).get();
		Student s1=Student.builder()
				   .sid(id)
				   .sname(st.getSname())
				   .sage(st.getSage())
				   .scontact(st.getScontact())
				   .scourse(st.getScourse())
				   .build();
		sr.save(s1);
		return "Record Updated Successfully";
	}

	//method to delete a Student
	@Override
	public String deleteStudent(int id) 
	{
		sr.deleteById(id);
		return "Record Deleted Successfully";
	}

	//method to delete all Students
	@Override
	public String deleteAllStudents() 
	{
	    sr.deleteAll();
		return "All Records are Deleted Successfully";
	}

}
