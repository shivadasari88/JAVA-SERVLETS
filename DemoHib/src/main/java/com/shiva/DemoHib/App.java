package com.shiva.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    	Person shiva = new Person();
   
    	
    	Configuration con = new Configuration().configure().addAnnotatedClass(Person.class);
    	SessionFactory sf = con.buildSessionFactory();
    	Session session = sf.openSession();
    	
    	Transaction tx = session.beginTransaction();
    			
    	session.persist(shiva);
    	
    	tx.commit();
    	
    }
}
 