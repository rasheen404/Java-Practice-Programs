package com.learn.Employee;

public class EmployeeApp {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Ayush", 49999.9f);

		System.out.println(e1.getEmpId());
		System.out.println(e1.getName());
		System.out.println(e1.getSalary());

	}



}
