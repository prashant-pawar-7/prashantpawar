package com.springboothiber.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboothiber.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
