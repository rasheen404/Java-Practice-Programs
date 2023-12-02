package com.learn.ProfessorApp;

public class ProfessorApp {
	
	//static variable
	static String univName = "UTV";
	static int totalProf = 0;
	
	//Non-static variable
	int profId;
	String subject;
	
	//static Block
	static {
		System.out.println("Welcome to "+univName);
		
	}
	
	//Non-static Block
	{
		totalProf +=1;
		profId = totalProf;
		System.out.println("Hirirng New Professor....!");
	}
	
	//static method
	public static int getTotalProf()
	{
		return totalProf;
	}
	
	//Non-static method
	public void teach() {
		System.out.println("Professor ID: "+profId+" is teaching "+subject);
		
	}
	
	//Constructor
	public ProfessorApp(String subject)
	{
		this.subject=subject;
	}
	
	//static method
	public static void main(String[] args) {
		System.out.println("Total Professors at start : "+ProfessorApp.getTotalProf());
		System.out.println("-------------------------------------------------------");
		ProfessorApp professor1 = new ProfessorApp("Java");
		professor1.teach();
		ProfessorApp professor2 = new ProfessorApp("Java");
		professor2.teach();
		System.out.println("-------------------------------------------------------");
		System.out.println("Total professors now "+ProfessorApp.getTotalProf());
	}
}
