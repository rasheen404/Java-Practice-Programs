package unidirection.OnetoOne.HibernateExample4.Hibernate_OnetoOneMapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person1 {

	@Id
	int id;
	String name;
	int age;
	@OneToOne
	Bike1 bike1;

	public Person1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person1(int id, String name, int age, Bike1 bike1) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.bike1 = bike1;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Bike1 getBike1() {
		return bike1;
	}

	public void setBike1(Bike1 bike1) {
		this.bike1 = bike1;
	}

	@Override
	public String toString() {
		return "Person1 [id=" + id + ", name=" + name + ", age=" + age + ", bike1=" + bike1 + "]";
	}

}
