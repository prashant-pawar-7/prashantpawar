package com.springboothiber.testservice;

import static org.assertj.core.api.Assertions.assertThat;


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
			        .scourse(new Courses(1,"Java","3 month",3000.0f))
			        .build();
	String s="Rohan";
	assertThat(ss.createStudent(std).getSname()).isEqualTo(s);				
}

@Test
void testGetStudent()
   {int id=44;
	assertThat(ss.getStudent(id).getSid()).isEqualTo(id);}

@Test
void testUpdateStudent()
{
	StudentDTO st = StudentDTO.builder()
			       .sname("Zinn")
			       .sage("23")
			       .scontact("9568745576")
			       .build();
    String s="Zinn";
	assertThat(ss.updateStudent(58,st)==s);
}

@Test
void testDeleteStudent()
     {assertThat(ss.deleteStudent(60));}



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
    {int id=4;
	assertThat(cs.getCourse(id).getCid()).isEqualTo(id);}

@Test
void testUpdateCourse()
{
	CourseDTO cdt = CourseDTO.builder()
			       .cid(5)
			       .cname("MySQL")
			       .cduration("1 Month")
			       .cfees(1500).build();
	String s="MySQL";
	assertThat(cs.updateCourse(5,cdt)==s);
}

@Test
void testDeleteCourse()
    {assertThat(cs.deleteCourse(5));}


}
