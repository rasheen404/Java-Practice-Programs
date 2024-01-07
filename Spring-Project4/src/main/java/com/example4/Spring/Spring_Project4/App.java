package com.example4.Spring.Spring_Project4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

		Employee emp1 = (Employee) ctx.getBean("emp1");
		System.out.println(emp1);

		Employee emp2 = (Employee) ctx.getBean("emp2");
		System.out.println(emp2);
		
		CompanyXYZ company = (CompanyXYZ)ctx.getBean("company");
		System.out.println(company);
	}
}
