package com.demo.test;



import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.demo.model.*;

public class TestTablePerClass {
	public static void main(String[] args) {
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session s1=sf.openSession();
		Transaction tr=s1.beginTransaction();
		PerishableProduct p1=new PerishableProduct(1,"biscuit",new Date(),new Date());
		s1.save(p1);
		tr.commit();
		
	}
}
