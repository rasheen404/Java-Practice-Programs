package bidirectional.OnetoOne.HibernateExample5;

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

		Person2 person1 = new Person2();
		Person2 person2 = new Person2();
		Person2 person3 = new Person2();

		Bike2 bike1 = new Bike2(1234, "KTM", 125000, person1);
		Bike2 bike2 = new Bike2(2233, "DUCATTI", 200000, person2);
		Bike2 bike3 = new Bike2(3356, "SUZUKI", 110000, person3);

		person1.setId(1);
		person1.setName("JAGGU");
		person1.setAge(28);
		person1.setBike2(bike1);

		person2.setId(2);
		person2.setName("VISHNU");
		person2.setAge(30);
		person2.setBike2(bike2);

		person3.setId(3);
		person3.setName("AKHIL");
		person3.setAge(25);
		person3.setBike2(bike3);

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
