package problem1;

public class Student implements Comparable<Student>{
	   private int sid;
       private String name;
       private String contact;
    public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sid, String name, String contact) {
		super();
		this.sid = sid;
		this.name = name;
		this.contact = contact;
	}

	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", contact=" + contact + "]";
	}
	@Override
	public int compareTo(Student o) {
		if (this.sid>o.getSid()) {
			return 1;
		} else if (this.sid<o.getSid()) {
			return -1;
		} else {
            return 0;
		}
	}
       
}
