package com.learn.HibernateExample2.HibernateExample2;

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

		Student student = new Student(11, "Ankit", 78);
		session.save(student);
		transaction.commit();

		System.out.println("Student Object Created and Saved.");
	}
}
