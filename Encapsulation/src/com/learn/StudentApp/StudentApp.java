package com.learn.StudentApp;

public class StudentApp {

	public static void main(String[] args) {
		
		Student student = new Student();
		
		student.setData(11, "AJAY", 27);
		
		System.out.print(student.getRollNo()+" ");
		System.out.print(student.getName()+" ");
		System.out.print(student.getAge());

	}

}
