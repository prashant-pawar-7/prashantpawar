package problem3;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) throws Exception {
		
		//creating objects to a student class
		Student s1=new Student("Anuj", 1, "9307515220");
		Student s2=new Student("Sagar", 2, "8530895623");
		Student s3=new Student("Adarsh", 3, "8830568516");
		
		//creating a file
		File f=new File("Student");
		FileWriter fw=new FileWriter(f);
		FileReader fr=new FileReader(f);
		
		//writing objects into a file
		fw.write("s1");
		fw.write("s2");
		fw.write("s3");
		//System.out.println(fr.read());
		
		//closing the reader and writer streams
		fw.close();
		fr.close();
		
		System.out.println("\nStudent info whose names starts with 'A'..\n");
		Student s[]= {s1,s2,s3};
		for(int i=0;i<s.length;i++)
		{
		   if(Pattern.matches("[A]\\w+",s[i].getName()))
		    {
				System.out.println("Name : "+s[i].getName());
				System.out.println("Student Id : "+s[i].getId());
				System.out.println("Contact no. : "+s[i].getContact()+" \n");
		    }
		}
	}
}
