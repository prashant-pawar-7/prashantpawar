package com.example.CollegeMgt.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="Student_ATDEV")
public class Student {
	
	@Id
	private int sid;
	private String fname;
	private String lname;
	private int age;
	private String contact;
	@Email
	private String email;
	
}
