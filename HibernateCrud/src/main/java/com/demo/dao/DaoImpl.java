package com.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.demo.model.User;

public class DaoImpl implements Idao{
	 static SessionFactory sf;
	    static {
	    	sf=HibernateUtil.getMySessionFactory();
	    }
  
	public void save(User u1) {
	 Session s1=sf.openSession();
	 Transaction tr=s1.beginTransaction();
	 s1.save(u1);
	 tr.commit();
	 s1.close();
		
	}

	public List<User> FindAll() {
		Session s1=sf.openSession();
		Transaction tr=s1.beginTransaction();
		//HQL Query --
		Query query=s1.createQuery("from User");
		List<User>ul=query.list();
		tr.commit();
		s1.close();
		return ul;
	}

	public boolean DeletByID(int id) {
		Session s1=sf.openSession();
		Transaction tr=s1.beginTransaction();
		User u =s1.get(User.class, id);
		if(u!=null)
		{   
			s1.delete(u);
			tr.commit();
			s1.close();
			return true;
		}
		
		return false;
	}

}
