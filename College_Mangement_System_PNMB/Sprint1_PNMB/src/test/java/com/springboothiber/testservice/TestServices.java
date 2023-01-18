package com.springboothiber.testservice;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import com.springboothiber.Project1Application;
import com.springboothiber.dto.CourseDTO;
import com.springboothiber.dto.StudentDTO;
import com.springboothiber.entities.Courses;
import com.springboothiber.repositories.CourseRepository;
import com.springboothiber.repositories.StudentRepository;
import com.springboothiber.service.CourseService;
import com.springboothiber.service.StudentService;

@SpringBootTest(classes = Project1Application.class)
@ContextConfiguration
public class TestServices {
	
	@Autowired(required=true)
	StudentRepository sr;
	
	@Autowired(required=true)
	StudentService ss;
	
    @Autowired(required=true)
	CourseRepository cr;
	   
	@Autowired(required=true)
	CourseService cs;

	
@Test
void testCreateStudent()
{
	StudentDTO std= StudentDTO.builder()
			        .sname("Rohan")
			        .sage("24")
			        .scontact("9502794498")
			        .scourse(new Courses(39,"Java","3 month",10000.0f))
			        .build();
	String s="Rohan";
	assertEquals(s,ss.createStudent(std).getSname());				
}

@Test
void testGetStudent()
   {int id=44;
	assertTrue(ss.getStudent(id).getSid()==(id));
	}



@Test
void testDeleteStudent()
   {
	 assertTrue(ss.deleteStudent(60).equalsIgnoreCase("Record Deleted Successfully..."));
   }

@Test
void testCreateCourse()
  {
   CourseDTO cdt = CourseDTO.builder()
		           .cid(5)
		           .cname("RDBMS")
		           .cduration("1 Month")
		           .cfees(1500).build();
   String s="RDBMS";
   assertThat(cs.createCourse(cdt).getCname()).isEqualTo(s);		           
  } 

@Test
void testgetCourse()
    {
	 int id=48;
	 assertEquals(id,cs.getCourse(id).getCid());
	}
@Test
void testDeleteCourse()
    {
	assertTrue(cs.deleteCourse(54).equalsIgnoreCase("Record Deleted Successfully..."));
	}
}
