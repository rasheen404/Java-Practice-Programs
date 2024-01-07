package com.example1.Spring.Spring_Project1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		JavaTeacher javaobject1 = (JavaTeacher) ctx.getBean("JavaTeacher1");
		SqlTeacher sqlobject1 = (SqlTeacher) ctx.getBean("SqlTeacher1");
		PythonTeacher pythonobject1 = (PythonTeacher) ctx.getBean("PythonTeacher1");

		System.out.println(javaobject1);
		System.out.println(sqlobject1);
		System.out.println(pythonobject1);
	}
}
