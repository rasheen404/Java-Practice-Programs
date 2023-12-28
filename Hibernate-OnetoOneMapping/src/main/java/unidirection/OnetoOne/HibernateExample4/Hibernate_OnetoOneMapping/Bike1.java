package unidirection.OnetoOne.HibernateExample4.Hibernate_OnetoOneMapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bike1 {
	@Id
	int Engine_no;
	String brand;
	int cost;
	@Override
	public String toString() {
		return "Bike1 [Engine_no=" + Engine_no + ", brand=" + brand + ", cost=" + cost + "]";
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
	public Bike1(int engine_no, String brand, int cost) {
		super();
		Engine_no = engine_no;
		this.brand = brand;
		this.cost = cost;
	}
	public Bike1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
