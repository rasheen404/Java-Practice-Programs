package com.example6.Spring.Spring_Project6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class University {
	@Autowired
	@Qualifier("professor2")
	Professor professor;

	public University() {
		super();
		// TODO Auto-generated constructor stub
	}

	public University(Professor professor) {
		super();
		this.professor = professor;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	@Override
	public String toString() {
		return "University [professor=" + professor + "]";
	}

}
