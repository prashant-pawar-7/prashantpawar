package com.springboothiber.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import com.springboothiber.entities.Courses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class StudentDTO {        //DTO class for Student

	@NotBlank(message = "Name can't be Blank")
	@NotNull(message = "Name can't be  null")
	@Size(min = 2, max = 20, message = "Name must be within 2-20 characters")
	private String sname;
	
	@NotNull(message = "Age can't be  null")
	@NotBlank(message = "Age can't be Blank")
	@Pattern(regexp="[234][\\d]{1}$", message="Invalid age")
	private String sage;
	
	@NotNull(message = "Contact number can not be null")
	@NotBlank(message = "Contact number can't be Blank")
	@Pattern(regexp = "\\d{10}$", message = " Invalid phone number ")
	private String scontact;

    @NotNull(message="Course cannot be null")
	private Courses scourse;
	
}
