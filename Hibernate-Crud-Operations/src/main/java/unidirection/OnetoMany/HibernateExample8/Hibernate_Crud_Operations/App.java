package unidirection.OnetoMany.HibernateExample8.Hibernate_Crud_Operations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		// create();
		// fetchData();
		// update();
		// delete();
	}

	public static void create() {
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		// creating object of entity
		Person person1 = new Person(1, "SUMIT", 25, "sumit@email.com", 987654321L);
		Person person2 = new Person(2, "MOHAN", 28, "mohan@email.com", 987654454L);
		// saving
		session.save(person1);
		session.save(person2);
		transaction.commit();
	}

	public static void fetchData() {
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		Person person = session.get(Person.class, 1);

		transaction.commit();
		System.out.println(person);

	}

	public static void update() {

	}

	public static void delete() {
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		Person deletePerson = session.get(Person.class, 2);
		session.delete(deletePerson);
	}
}
