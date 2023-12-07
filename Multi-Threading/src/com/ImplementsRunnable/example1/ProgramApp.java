package com.ImplementsRunnable.example1;
public class ProgramApp {
	public static void main(String[] args) {

		PrintNum printNum = new PrintNum();
		PrintChar printChar = new PrintChar();
		
		Thread t1 = new Thread(printNum);
		Thread t2 = new Thread(printChar);
		
		t1.start();
		t2.start();
		

	
	}
	

}
