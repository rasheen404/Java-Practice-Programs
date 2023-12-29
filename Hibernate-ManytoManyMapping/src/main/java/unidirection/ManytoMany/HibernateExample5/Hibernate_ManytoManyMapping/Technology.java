package unidirection.ManytoMany.HibernateExample5.Hibernate_ManytoManyMapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Technology {

	@Id
	int T_id;
	String T_name;

	@ManyToMany
	List<SoftEng> id;

	public Technology() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Technology(int t_id, String t_name, List<SoftEng> id) {
		super();
		T_id = t_id;
		T_name = t_name;
		this.id = id;
	}

	public int getT_id() {
		return T_id;
	}

	public void setT_id(int t_id) {
		T_id = t_id;
	}

	public String getT_name() {
		return T_name;
	}

	public void setT_name(String t_name) {
		T_name = t_name;
	}

	public List<SoftEng> getId() {
		return id;
	}

	public void setId(List<SoftEng> id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Technology [T_id=" + T_id + ", T_name=" + T_name + ", id=" + id + "]";
	}

}
