package unidirection.OnetoMany.HibernateExample7.Hibernate_1_M_Mapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class SoftwareEngineers {
	@Id
	int id;
	String name;
	int age;
	@OneToMany
	List<Technology> technologies;
	public SoftwareEngineers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SoftwareEngineers(int id, String name, int age, List<Technology> technologies) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.technologies = technologies;
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
	public List<Technology> getTechnologies() {
		return technologies;
	}
	public void setTechnologies(List<Technology> technologies) {
		this.technologies = technologies;
	}
	@Override
	public String toString() {
		return "SoftwareEngineers [id=" + id + ", name=" + name + ", age=" + age + ", technologies=" + technologies
				+ "]";
	}
	
	

}
