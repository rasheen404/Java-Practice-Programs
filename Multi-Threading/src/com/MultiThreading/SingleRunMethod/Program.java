package com.MultiThreading.SingleRunMethod;

public class Program extends Thread {

	// method for run
	public void run() {
		// checking whether the name of thread is "printNum"
		if (Thread.currentThread().getName().equals("printNum")) {
			// call printNum
			printNum();
		}
		// otherwise
		else {
			// call printChar
			printChar();
		}
	}

	// method for print number
	public void printNum() {

		System.out.println("Number started Printing");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
		System.out.println("Number Ended Printing");

	}

//method for print character
	public void printChar() {
		System.out.println("Character started Printing");
		for (char i = 'A'; i <= 'E'; i++) {
			System.out.println(i);

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {

				e.printStackTrace();

			}
		}
		System.out.println("Character Ended Printing");
	}

}
