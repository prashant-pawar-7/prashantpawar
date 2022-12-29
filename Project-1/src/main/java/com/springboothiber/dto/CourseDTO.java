package com.springboothiber.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CourseDTO {        //DTO class for Course
	
	private int cid;
	
    @NotBlank (message="Course name cannot be blank")
	@NotNull (message="Course name cannot be null")
	private String cname;
    
    @NotBlank (message="Course duration cannot be blank")
	@NotNull (message="Course duration cannot be null")
    private String cduration;
    
    private float cfees;
	
}
