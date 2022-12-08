package com.hibernate.studentDao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.entities.Student;
import com.hibernate.hiberutil.Hiberutil;

public class Daoimpl implements StudentDao {
	Session ss=Hiberutil.getSession();
    Transaction tx;
	public void insertStudent(Student S) {
		tx=ss.beginTransaction();
		ss.save(S);
		tx.commit();
	}

	public Student getStudent(int id) {
		return ss.get(Student.class, id);
	}

	public boolean deleteStudent(int id) {
		tx=ss.beginTransaction();
		Student s=ss.get(Student.class, id);
		ss.delete(s);
		tx.commit();
		ss.close();
		return true;
	}

	public boolean updateStudent(int id,String name) {
		tx=ss.beginTransaction();
		Student s1=ss.get(Student.class, id);
		s1.setSname(name);;
		ss.update(s1);
		tx.commit();
		ss.close();
		return false;
	}
	
}
