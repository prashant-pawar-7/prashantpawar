package com.product;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.product.dao.CustomerDao;
import com.product.dao.ProductDao;
import com.product.entities.Customer;
import com.product.entities.Product;



public class App 
{
    public static void main( String[] args )
    {
    	displayMenu();
    }
    public static void displayMenu() {
    	Scanner s=new Scanner(System.in);
    	ApplicationContext a= new ClassPathXmlApplicationContext("applicationcontext.xml") ;
    	//getting bean of customerdao
		CustomerDao cst=(CustomerDao) a.getBean("CustomerDao");
		Customer c1=(Customer) a.getBean("Customer1");
		//getting bean of productdao
		ProductDao pt=(ProductDao) a.getBean("ProductDao");
		Product p1=(Product) a.getBean("Product1");
		//process menu
		System.out.println("Enter choice\n "
				+ "1.Insert Customer or product\n"
				+ "2.update Customer or product\n"
				+ "3.delete Customer or product\n"
				+ "4. View Customer or product\n"
				+ "5.View all Customer or product\\n");
		int i=s.nextInt();
		int id ;
		//swich case for choice
		switch (i){
		case 1:
			i=pt.insertProduct(p1); 
			//i=cst.insertCustomer(c1);
			System.out.println(i+ "record successfully inserted");
			break;
		case 2:
			System.out.println("Enter id no to be updated ");
			id =s.nextInt();
			System.out.println("Enter id no to be updated ");
			String name=s.next();
			 i=cst.updateCustomer(id,name);
			System.out.println(i+ "record successfully inserted");
			break;
		case 3:
			i=cst.deleteCustomer(c1);
			System.out.println(i+ "record successfully inserted");
			break;
		case 4:
			System.out.println("Enter id no to be view customer ");
			 id =s.nextInt();
			System.out.println(cst.getCustomer(id));
			break;
		case 5:
			System.out.println(cst.getAllCustomers());
			break;
		default:
			break;
		}
		
    }
}
