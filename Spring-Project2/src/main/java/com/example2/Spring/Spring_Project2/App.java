package com.example2.Spring.Spring_Project2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		Laptop laptop1 = (Laptop) ctx.getBean("laptop1");
		System.out.println(laptop1);
	}
}
