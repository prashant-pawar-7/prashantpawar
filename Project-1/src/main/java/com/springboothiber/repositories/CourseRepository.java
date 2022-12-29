package com.springboothiber.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springboothiber.entities.Courses;

public interface CourseRepository extends JpaRepository<Courses, Integer>{

}
