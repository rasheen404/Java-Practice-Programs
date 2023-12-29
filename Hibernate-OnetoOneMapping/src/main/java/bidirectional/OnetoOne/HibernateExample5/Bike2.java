package bidirectional.OnetoOne.HibernateExample5;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Bike2 {
	@Id
	int Engine_no;
	String brand;
	int cost;
	@OneToOne
	Person2 person2;

	public Bike2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bike2(int engine_no, String brand, int cost, Person2 person2) {
		super();
		Engine_no = engine_no;
		this.brand = brand;
		this.cost = cost;
		this.person2 = person2;
	}

	public int getEngine_no() {
		return Engine_no;
	}

	public void setEngine_no(int engine_no) {
		Engine_no = engine_no;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public Person2 getPerson2() {
		return person2;
	}

	public void setPerson2(Person2 person2) {
		this.person2 = person2;
	}

	@Override
	public String toString() {
		return "Bike2 [Engine_no=" + Engine_no + ", brand=" + brand + ", cost=" + cost + ", person2=" + person2 + "]";
	}

}
