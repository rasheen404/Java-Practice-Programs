package com.example6.Spring.Spring_Project6;

public class Professor {
	int pro_id;
	String pro_name;
	String pro_subject;

	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Professor(int pro_id, String pro_name, String pro_subject) {
		super();
		this.pro_id = pro_id;
		this.pro_name = pro_name;
		this.pro_subject = pro_subject;
	}

	public int getPro_id() {
		return pro_id;
	}

	public void setPro_id(int pro_id) {
		this.pro_id = pro_id;
	}

	public String getPro_name() {
		return pro_name;
	}

	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}

	public String getPro_subject() {
		return pro_subject;
	}

	public void setPro_subject(String pro_subject) {
		this.pro_subject = pro_subject;
	}

	@Override
	public String toString() {
		return "Professor [pro_id=" + pro_id + ", pro_name=" + pro_name + ", pro_subject=" + pro_subject + "]";
	}

}
