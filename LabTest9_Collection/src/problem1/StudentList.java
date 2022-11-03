package problem1;

import java.util.ArrayList;
import java.util.Collections;

public class StudentList {
	public static ArrayList<Student> l1;
	public static ArrayList<Student> l2;
	public static void main(String[] args) {
		fillLists();
		printList();
	}
	
	public static void fillLists() {
		l1=new ArrayList<>();
		l2=new ArrayList<>();
		Student s1=new Student(1, "Prashant", "9307515220");
		Student s2=new Student(2,"Sagar","8530895620");
		Student s3=new Student(3,"Golu","8830501654");
		Student s4=new Student(4,"Pradip","9011202277");
		Student s5=new Student(5,"Gaurav","9856235478");
		Student s6=new Student(6,"Kaveri","8778562360");
		l1.add(s1);
		l1.add(s3);
		l1.add(s2);
		l2.add(s4);
		l2.add(s6);
		l2.add(s5);
		
	}

	public static void printList() {
		Collections.sort(l1);
		Collections.sort(l2);
		System.out.println("Sorting by Student Id\n");
		System.out.println(l1);
		System.out.println(l2);
		Collections.sort(l1, new NameComparator());
		Collections.sort(l2, new NameComparator());
		System.out.println("\nSorting by Student name\n");
		System.out.println(l1);
		System.out.println(l2);
		/*
		for (Student student : l1) {
		 
			System.out.print(student);
		}
		System.out.println();
		for (Student student : l2) {
			System.out.print(student);
		}
		*/
	}

}
