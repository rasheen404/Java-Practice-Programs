package unidirection.OnetoMany.HibernateExample7.Hibernate_1_M_Mapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Technology {
	@Id
	int t_Id;
	String t_Name;
	public Technology() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Technology(int t_Id, String t_Name) {
		super();
		this.t_Id = t_Id;
		this.t_Name = t_Name;
	}
	public int getT_Id() {
		return t_Id;
	}
	public void setT_Id(int t_Id) {
		this.t_Id = t_Id;
	}
	public String getT_Name() {
		return t_Name;
	}
	public void setT_Name(String t_Name) {
		this.t_Name = t_Name;
	}
	@Override
	public String toString() {
		return "Technology [t_Id=" + t_Id + ", t_Name=" + t_Name + "]";
	}
	
	

}
