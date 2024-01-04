package unidirection.OnetoMany.HibernateExample6.Hibernate_OnetoManyMapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {

	@Id
	int L_serialNo;
	String L_brand;
	@ManyToOne
	Students students;

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Laptop(int l_serialNo, String l_brand, Students students) {
		super();
		L_serialNo = l_serialNo;
		L_brand = l_brand;
		this.students = students;
	}

	public int getL_serialNo() {
		return L_serialNo;
	}

	public void setL_serialNo(int l_serialNo) {
		L_serialNo = l_serialNo;
	}

	public String getL_brand() {
		return L_brand;
	}

	public void setL_brand(String l_brand) {
		L_brand = l_brand;
	}

	public Students getStudents() {
		return students;
	}

	public void setStudents(Students students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Laptop [L_serialNo=" + L_serialNo + ", L_brand=" + L_brand + ", students=" + students + "]";
	}

}
