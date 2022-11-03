package problem2;

import java.util.TreeSet;

import problem1.Student;
import problem1.StudentList;

public class StudentTree {

	public static void main(String[] args) throws Exception{
		TreeSet<Student> set=new TreeSet<>();
		
		StudentList.fillLists();
		set.addAll(StudentList.l1);
		set.addAll(StudentList.l2);
		System.out.println("Number of element in the set : "+set.size());
		
		System.out.println("\nFirst element in the set : \n"+set.pollFirst());
		System.out.println("\nLast element in the set : \n"+set.pollLast());
	}

}
