package problem3;

import java.util.HashSet;
import problem1.Student;

public class StudentHashSet {

	public static void main(String[] args) {
		HashSet<Student> hset=new HashSet<>();
		Student s1=new Student(1, "Prashant", "9307515220");
		Student s2=new Student(2,"Sagar","8530895620");
		Student s3=new Student(3,"Golu","8830501654");
		Student s4=new Student(4,"Pradip","9011202277");
		Student s5=new Student(5,"Gaurav","9856235478");
		Student s6=new Student(6,"Kaveri","8778562360");
		hset.add(s1);
		hset.add(s3);
		hset.add(s6);
		hset.add(s5);
		hset.add(s4);
		hset.add(s2);
		for (Student student : hset) {
			if (student.getSid()>3) {
				System.out.println(student);
			}
		}  
  }
}