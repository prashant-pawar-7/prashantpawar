package com.hibernate.studentDao;

import com.hibernate.entities.Student;

public interface StudentDao {
void insertStudent(Student S);
Student getStudent(int id);
boolean deleteStudent(int id);
boolean updateStudent(int id,String name);
}
