package unidirection.OnetoMany.HibernateExample6.Hibernate_OnetoManyMapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Students {
	
	@Id
	int rollNo;
	String name;
	@OneToMany
	List<Laptop> laptop;
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Students(int rollNo, String name, List<Laptop> laptop) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.laptop = laptop;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Laptop> getLaptop() {
		return laptop;
	}
	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}
	@Override
	public String toString() {
		return "Students [rollNo=" + rollNo + ", name=" + name + ", laptop=" + laptop + "]";
	}
	
	

}
