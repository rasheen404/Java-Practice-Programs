package unidirection.ManytoMany.HibernateExample5.Hibernate_ManytoManyMapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class SoftEng {
	@Id
	int id;
	String name;
	int age;
	
	@ManyToMany
	List<Technology> t_id;

	public SoftEng() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SoftEng(int id, String name, int age, List<Technology> t_id) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.t_id = t_id;
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

	public List<Technology> getT_id() {
		return t_id;
	}

	public void setT_id(List<Technology> t_id) {
		this.t_id = t_id;
	}

	@Override
	public String toString() {
		return "SoftEng [id=" + id + ", name=" + name + ", age=" + age + ", t_id=" + t_id + "]";
	}
	
	

}
