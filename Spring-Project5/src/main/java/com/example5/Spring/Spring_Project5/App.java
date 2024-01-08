package com.example5.Spring.Spring_Project5;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		Engine engine1 = (Engine) ctx.getBean("eng");
		System.out.println(engine1);

		Car car1 = (Car) ctx.getBean("car");
		System.out.println(car1);
	}
}
