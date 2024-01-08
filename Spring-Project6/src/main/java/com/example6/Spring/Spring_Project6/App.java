package com.example6.Spring.Spring_Project6;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

		Professor professor1 = (Professor) ctx.getBean("professor1");
		System.out.println(professor1);
		Professor professor2 = (Professor) ctx.getBean("professor2");
		System.out.println(professor1);
		Professor professor3 = (Professor) ctx.getBean("professor3");
		System.out.println(professor1);
		University university = (University) ctx.getBean("university");
		System.out.println(university);

	}
}
