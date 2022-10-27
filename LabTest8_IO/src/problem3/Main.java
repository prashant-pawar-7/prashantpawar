package problem3;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) throws Exception {
		
		//creating objects to a student class
		Student a=new Student("Anuj","1","9307515220");
		Student b=new Student("Sagar","2","8530895623");
		Student c=new Student("Adarsh","3","8830566816");
		
		//creating a file
		File f=new File("Student");
		FileWriter fw=new FileWriter(f);
		FileReader fr=new FileReader(f);
		
		//writing objects into a file
		fw.write("a");
		fw.write("b");
		fw.write("c");
		//System.out.println(fr.read());
		
		//closing the reader and writer streams
		fw.close();
		fr.close();
		
		System.out.println("\nStudent names starts with 'A' are..\n");
		Student s[]= {a,b,c};
		for(int i=0;i<s.length;i++)
		{
		   if(Pattern.matches("[A]\\w+",s[i].getName()))
		    {
				System.out.println("Name : "+s[i].getName());
				System.out.println("Student Id : "+s[i].getId());
				System.out.println("Contact no. : "+s[i].getContact()+"\n");
		    }
		}
	}
}
