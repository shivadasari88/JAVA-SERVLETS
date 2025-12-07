package com.shiva.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    	Person shiva = new Person(); //it can be null also
   
    	
    	Configuration con = new Configuration().configure().addAnnotatedClass(Person.class);
    	SessionFactory sf = con.buildSessionFactory();
    	Session session = sf.openSession();
    	
    	Transaction tx = session.beginTransaction();
    	
    	shiva = (Person)session.get(Person.class,101);
    		
    	
    	tx.commit();
    	
    	
    	System.out.print(shiva);
    }
}
 