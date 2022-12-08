package com.hibernate.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor

@Data
@Entity
@Table(name="Student_details")
public class Student {
	@Id
	@GeneratedValue
	private int  st_id;
	@Column(length=50,nullable=false)
	private String sname;
	@Column(length=10,nullable=false,unique=true)
	@Size(min=10,max=10)
	private String  contact;

}
