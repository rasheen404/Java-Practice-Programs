package com.example3.Spring.Spring_Project3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

		Employee employeeobject1 = (Employee) ctx.getBean("Employee1");

		System.out.println(employeeobject1);
	}
}
