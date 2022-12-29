package com.springboothiber.entities;

import javax.persistence.Entity;

import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor                   //Argumented constructor
@NoArgsConstructor                    //Default constructor
@Data                                 //Getter and Setter Method for all the data members
@Builder
@Entity                               //Specifying class is an entity
public class Courses {                //creating Student class

	//Data members 
	@Id
	private int cid;
	private String cname;
	private String cduration;
	private float cfees;
	
}
