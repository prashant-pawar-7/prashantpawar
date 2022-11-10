import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class EmployeeMain {
    static ArrayList<Employee> l1;
	public static void main(String[] args) {
		fillList();
		sortedList();
		greaterSalary();
		maximumSalary();
	}
	public static void maximumSalary() {
		System.out.println("\nEmployee having maximum salary");
		System.out.println(l1.stream().max((a,b)->a.getSalary()>b.getSalary()?1:-1).map(e->"Name : "+e.getName()+"; Department : "+e.getDepartment()).get());
	}
	public static void greaterSalary() {
		System.out.println("Employees whose salary is greater than 10000 : \n");
		System.out.println(l1.stream().filter(e1->e1.getSalary()>10000).collect(Collectors.toList()));
	}
	public static void sortedList() {
		System.out.println("Employees list sorted based on their name : \n");
		Collections.sort(l1, (a,b)->(a.getName().compareTo(b.getName())));
	    System.out.println(l1);
	}
	public static void fillList() {
		l1=new ArrayList<>();
		Employee e1=new Employee("Prashant", 21, "Software Development", 50000);
		Employee e2=new Employee("Sagar", 21, "Technical", 30000);
		Employee e3=new Employee("Nanu", 20, "Product Design", 7500);
		Employee e4=new Employee("Pradip", 22, "Finance", 70000);
		Employee e5=new Employee("Vipul", 21, "Account", 9500);
		Employee e6=new Employee("Golu", 20, "Management", 45000);
		l1.add(e1);
		l1.add(e2);
		l1.add(e3);
		l1.add(e4);
		l1.add(e5);
		l1.add(e6);
	}

}
