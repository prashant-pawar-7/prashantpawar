package com.example.CollegeMgt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CollegeMgt.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
