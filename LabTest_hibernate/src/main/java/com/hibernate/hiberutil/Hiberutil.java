package com.hibernate.hiberutil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hiberutil {
public static Session getSession() {
	Configuration c=new Configuration();
			c.configure();
	SessionFactory sFactory=c.buildSessionFactory();
	return sFactory.openSession();
}
}
