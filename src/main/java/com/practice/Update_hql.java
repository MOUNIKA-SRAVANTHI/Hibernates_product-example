package com.practice;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update_hql {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg =new Configuration().configure();
        SessionFactory sf =cfg.buildSessionFactory();
        Session session =sf.openSession();
        Transaction tx= session.beginTransaction();
       
        
        
        
        
        
        tx.commit();
        sf.close();
        session.close();
        

	}

}
