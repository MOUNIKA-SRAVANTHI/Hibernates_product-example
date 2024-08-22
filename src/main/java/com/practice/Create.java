package com.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Create {

	public static void main(String[] args) {
		
     Configuration cfg =new Configuration().configure();
        SessionFactory sf =cfg.buildSessionFactory();
        Session session =sf.openSession();
        Transaction tx= session.beginTransaction();
        
        Manager obj =new Manager();   
        obj.setName("bubby");
        obj.setDept("incharge");
        obj.setExp(11);
        session.save(obj);
        
        
        
        
        
        tx.commit();
        sf.close();
        session.close();
        
		


	}

}
