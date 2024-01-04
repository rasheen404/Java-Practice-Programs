package unidirection.OnetoMany.HibernateExample7.Hibernate_1_M_Mapping;

import java.util.ArrayList;

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

		Technology technology1 = new Technology(123, "Java");
		Technology technology2 = new Technology(124, "HTML");
		Technology technology3 = new Technology(125, "CSS");
		Technology technology4 = new Technology(126, "SQL");

		ArrayList<Technology> list1 = new ArrayList<Technology>();
		ArrayList<Technology> list2 = new ArrayList<Technology>();
		ArrayList<Technology> list3 = new ArrayList<Technology>();

		list1.add(technology1);
		list1.add(technology2);

		list2.add(technology1);
		list2.add(technology2);
		list2.add(technology3);
		list2.add(technology4);

		list3.add(technology1);
		list3.add(technology4);

		SoftwareEngineers softwareEngineers1 = new SoftwareEngineers(1, "SUMIT", 29, list1);
		SoftwareEngineers softwareEngineers2 = new SoftwareEngineers(2, "SOURAV", 30, list2);
		SoftwareEngineers softwareEngineers3 = new SoftwareEngineers(3, "SACHIN", 28, list3);
		
		
		
		session.save(softwareEngineers1);
		session.save(softwareEngineers2);
		session.save(softwareEngineers3);
		
		session.save(technology1);
		session.save(technology2);
		session.save(technology3);
		session.save(technology4);
		
		
		transaction.commit();
		System.out.println("Query successfully executed.");
		

	}
}
