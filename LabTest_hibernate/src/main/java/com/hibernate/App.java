package com.hibernate;

import java.util.Scanner;

import javax.net.ssl.SSLContext;

import org.hibernate.Session;

import com.hibernate.entities.Student;
import com.hibernate.hiberutil.Hiberutil;
import com.hibernate.studentDao.Daoimpl;
import com.hibernate.studentDao.StudentDao;

import lombok.AllArgsConstructor;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
        StudentDao sDao=new Daoimpl();
		System.out.println("enter choice\n 1.Create Student\n2.View Student");
		Scanner sc = new Scanner(System.in);
		Student s;
		int id;
		int i = sc.nextInt();
		switch (i) {
		case 1:
          s=new Student();
          s.setSt_id(1);
          s.setSname("Prashant");
          s.setContact("7798322717");
          sDao.insertStudent(s);
          
			break;
		case 2:
			 id=sc.nextInt();
            s=sDao.getStudent(id);
            System.out.println(s);
			break;
		case 3:
			 id=sc.nextInt();
            sDao.deleteStudent(id);
			break;
		case 4:
			 id=sc.nextInt();
			 String name="Gaurav";
            sDao.updateStudent(id, name);
           
			break;
		default:
			sc.close();
			break;
		}
	}
}
