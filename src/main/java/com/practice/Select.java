package com.practice;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     Configuration cfg =new Configuration().configure();
	        SessionFactory sf =cfg.buildSessionFactory();
	        Session session =sf.openSession();
	        Transaction tx= session.beginTransaction();
	        
	       /* Query query=session.createQuery("from Manager");
	      List<Manager> list=query.list();
	       for(Manager obj : list)
	       {
	       	System.out.println(obj);
	        }
	        
	      */  
	        
	        //experience above 10 years
	        
	        /*Query query=session.createQuery("from Manager where exp>=:e");
	        query.setParameter("e", 10);
	        List<Manager> list=query.list();
	        for(Manager obj : list)
	        {
	        	System.out.println(obj);
	        }
	        */
	        
	        Query query=session.createQuery("delete from Manager where exp>=:e and dept!=:d");
	        query.setParameter("e", 8);
	        query.setParameter("d", "sales");
	        query.executeUpdate();
	        
	        
	        
	        
	        tx.commit();
	        sf.close();
	        session.close();
	        

	}

}
