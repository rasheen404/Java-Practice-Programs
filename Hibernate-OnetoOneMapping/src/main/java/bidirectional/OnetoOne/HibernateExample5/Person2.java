package bidirectional.OnetoOne.HibernateExample5;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person2 {

	@Id
	int id;
	String name;
	int age;
	@OneToOne
	Bike2 bike2;

	public Person2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person2(int id, String name, int age, Bike2 bike2) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.bike2 = bike2;
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

	public Bike2 getBike2() {
		return bike2;
	}

	public void setBike2(Bike2 bike2) {
		this.bike2 = bike2;
	}

	@Override
	public String toString() {
		return "Person2 [id=" + id + ", name=" + name + ", age=" + age + ", bike2=" + bike2 + "]";
	}

}