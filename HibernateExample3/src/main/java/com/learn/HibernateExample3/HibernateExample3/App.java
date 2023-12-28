package com.learn.HibernateExample3.HibernateExample3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		Person person1 = new Person(1, "ANKIT", 32);
		Person person2 = new Person(2, "MOHAN", 30);
		Person person3 = new Person(3, "RAJU", 35);
		session.save(person1);
		session.save(person2);
		session.save(person3);

		Bike bike1 = new Bike(1111, "BMW", 99999);
		Bike bike2 = new Bike(2222, "HONDA", 65999);
		Bike bike3 = new Bike(3333, "SUZUKI", 59999);
		session.save(bike1);
		session.save(bike2);
		session.save(bike3);

		transaction.commit();

		System.out.println("Objects are created and Saved Successfully.");
	}
}
