package unidirection.ManytoMany.HibernateExample5.Hibernate_ManytoManyMapping;

import java.util.*;

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

		// Creating Object for Technologies
		Technology technology1 = new Technology();
		Technology technology2 = new Technology();
		Technology technology3 = new Technology();
		Technology technology4 = new Technology();

		// Creating Object for Software Engineers
		SoftEng softEng1 = new SoftEng();
		SoftEng softEng2 = new SoftEng();
		SoftEng softEng3 = new SoftEng();

		// created a list to be assigneed for Software Engineering 1
		// (sumit is working on java and html)
		List<Technology> techlist1 = new ArrayList<Technology>();
		techlist1.add(technology1);
		techlist1.add(technology2);

		// created a list to be assigneed for Software Engineering 2
		// Saourav is working on java,html,css,sql
		List<Technology> techlist2 = new ArrayList<Technology>();
		techlist2.add(technology1);
		techlist2.add(technology2);
		techlist2.add(technology3);
		techlist2.add(technology4);

		// created a list to be assigneed for Software Engineering 3
		// Sachin is working on java and sql
		List<Technology> techlist3 = new ArrayList<Technology>();
		techlist3.add(technology1);
		techlist3.add(technology4);

		// creating list for Technology 1 (sumit,sourav,sachin)
		List<SoftEng> sotwarelist1 = new ArrayList<SoftEng>();
		sotwarelist1.add(softEng1);
		sotwarelist1.add(softEng2);
		sotwarelist1.add(softEng3);

		// creating list for Technology 2 (sumit and sourav)
		List<SoftEng> sotwarelist2 = new ArrayList<SoftEng>();
		sotwarelist2.add(softEng1);
		sotwarelist2.add(softEng2);

		// creating list for Technology 3 (only sourav)
		List<SoftEng> sotwarelist3 = new ArrayList<SoftEng>();
		sotwarelist3.add(softEng2);

		// creating list for Technology 4 (sourav and sachin)
		List<SoftEng> sotwarelist4 = new ArrayList<SoftEng>();
		sotwarelist4.add(softEng2);
		sotwarelist4.add(softEng3);

		// Setting value in Technology.
		technology1.setT_id(123);
		technology1.setT_name("Java");
		technology1.setId(sotwarelist1);

		technology2.setT_id(124);
		technology2.setT_name("Html");
		technology2.setId(sotwarelist2);

		technology3.setT_id(125);
		technology3.setT_name("CSS");
		technology3.setId(sotwarelist3);

		technology4.setT_id(126);
		technology4.setT_name("SQL");
		technology4.setId(sotwarelist4);

		// Setting value for Software Engineers.
		softEng1.setId(1);
		softEng1.setName("Sumit");
		softEng1.setAge(29);
		softEng1.setT_id(techlist1);

		softEng2.setId(2);
		softEng2.setName("Sourav");
		softEng2.setAge(30);
		softEng2.setT_id(techlist2);

		softEng3.setId(3);
		softEng3.setName("Sachin");
		softEng3.setAge(28);
		softEng3.setT_id(techlist3);

		session.save(technology1);
		session.save(technology2);
		session.save(technology3);
		session.save(technology4);
		session.save(softEng1);
		session.save(softEng2);
		session.save(softEng3);

		transaction.commit();

		System.out.println("Objects are created and Saved Successfully.");
	}
}
