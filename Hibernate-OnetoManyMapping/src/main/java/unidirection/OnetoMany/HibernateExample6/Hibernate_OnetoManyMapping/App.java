package unidirection.OnetoMany.HibernateExample6.Hibernate_OnetoManyMapping;

import java.util.ArrayList;
import java.util.List;

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

		Students students1 = new Students();
		Students students2 = new Students();
		Students students3 = new Students();
		

		List<Laptop> laplist1 = new ArrayList<Laptop>();
		List<Laptop> laplist2 = new ArrayList<Laptop>();
		List<Laptop> laplist3 = new ArrayList<Laptop>();

		Laptop laptop1 = new Laptop(1223, "HP", students2);
		Laptop laptop2 = new Laptop(1224, "LENOVA", students1);
		Laptop laptop3 = new Laptop(1225, "DELL", students2);
		Laptop laptop4 = new Laptop(1226, "ASUS", students1);
		Laptop laptop5 = new Laptop(1227, "MAC", students3);
		Laptop laptop6 = new Laptop(1228, "ACER", students2);
		Laptop laptop7 = new Laptop(1229, "MI", students3);


		laplist1.add(laptop2);
		laplist1.add(laptop4);

		laplist2.add(laptop1);
		laplist2.add(laptop3);
		laplist2.add(laptop6);

		laplist3.add(laptop5);
		laplist3.add(laptop7);

		students1.setRollNo(1);
		students1.setName("ROHIT");
		students1.setLaptop(laplist1);

		students2.setRollNo(2);
		students2.setName("SURAJ");
		students2.setLaptop(laplist2);

		students3.setRollNo(3);
		students3.setName("MANOJ");
		students3.setLaptop(laplist3);

		session.save(laptop1);
		session.save(laptop2);
		session.save(laptop3);
		session.save(laptop4);
		session.save(laptop5);
		session.save(laptop6);
		session.save(laptop7);

		session.save(students1);
		session.save(students2);
		session.save(students3);

		transaction.commit();

		System.out.println("Objects are created and Saved Successfully.");

	}
}