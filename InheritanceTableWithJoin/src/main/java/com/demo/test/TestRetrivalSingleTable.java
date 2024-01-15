package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.demo.model.*;
public class TestRetrivalSingleTable {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session s1=sf.openSession();
		Transaction tr=s1.beginTransaction();
		WageEmployee w4=s1.get(WageEmployee.class,1);
		tr.commit();
		s1.close();
		sf.close();
		System.err.println(w4);
		 
	}

}
