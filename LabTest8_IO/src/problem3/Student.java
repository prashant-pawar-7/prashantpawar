package problem3;

import java.io.Serializable;

public class Student implements Serializable{
	private String name;
	private int id;
	private String contact;
public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
public Student(String name, int id, String contact) {
		super();
		this.name = name;
		this.id = id;
		this.contact = contact;
	}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}


}
