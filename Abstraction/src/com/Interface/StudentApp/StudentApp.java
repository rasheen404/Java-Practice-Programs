package com.Interface.StudentApp;

public class StudentApp {
	public static void doActivity(StudentActivity studentActivity)
	{
		studentActivity.attendClass();
		studentActivity.study();
		studentActivity.assignment();
	}
	
	public static void main(String[] args) {
		ChemistryClass chemistryClass = new ChemistryClass();
		PhysicsClass physicsClass = new PhysicsClass();
		
		doActivity(physicsClass);
		System.out.println("--------------------------------------------------------");
		doActivity(chemistryClass);
		
	}

}
