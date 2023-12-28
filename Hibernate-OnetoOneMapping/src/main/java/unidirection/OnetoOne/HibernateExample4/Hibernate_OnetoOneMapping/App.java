package unidirection.OnetoOne.HibernateExample4.Hibernate_OnetoOneMapping;

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

		Bike1 bike1 = new Bike1(1234, "HERO", 125000);
		Bike1 bike2 = new Bike1(2233, "HONDA", 100000);
		Bike1 bike3 = new Bike1(3356, "SUZUKI", 110000);

		Person1 person1 = new Person1(1, "ANKIT", 32, bike1);
		Person1 person2 = new Person1(2, "MOHAN", 30, bike2);
		Person1 person3 = new Person1(3, "RAJU", 35, bike3);

		session.save(person1);
		session.save(person2);
		session.save(person3);
		session.save(bike1);
		session.save(bike2);
		session.save(bike3);

		transaction.commit();

		System.out.println("Objects are created and Saved Successfully.");
	}
}
