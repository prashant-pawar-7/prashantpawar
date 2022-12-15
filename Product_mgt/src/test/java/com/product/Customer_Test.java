package com.product;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.product.dao.CustomerDao;
import junit.framework.TestCase;

public class Customer_Test extends TestCase {
	static CustomerDao c;
	
	@BeforeAll
public static void beforeAll() {
		System.out.println("test initialized");
	}
	@Test
public void testGetCusotmer() {
		//negative test case
		ApplicationContext a=new ClassPathXmlApplicationContext("applicationcontext.xml");
		c= (CustomerDao) a.getBean("CustomerDao");
		assertEquals(1, c.getCustomer(101).getPList().size());
	}
	public void testG() {
		//positive test case
		ApplicationContext a=new ClassPathXmlApplicationContext("applicationcontext.xml");
		c= (CustomerDao) a.getBean("CustomerDao");
		assertEquals(1, c.updateCustomer(101, "Golu"));
	}
}
