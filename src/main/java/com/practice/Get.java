package com.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Get {

	public static void main(String[] args) {
		Configuration cfg =new Configuration().configure();
        SessionFactory sf =cfg.buildSessionFactory();
        Session session =sf.openSession();
        Transaction tx= session.beginTransaction();
        
        Manager obj=(Manager)session.load(Manager.class,5);
        
        System.out.println(obj);
        
        

        tx.commit();
        sf.close();
        session.close();
        
		

	}

}
