package com.learn.Hibernate.Hibernate_Example1;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration configuration = new Configuration();
    	configuration.configure();
    	SessionFactory sessionFactory = configuration.buildSessionFactory();
    	
    	System.out.println(sessionFactory);
    	
    		System.out.println("Hibernate is Working.");
    }
}
