package com.MultiThreading.SingleRunMethod;

public class ProgramApp {

	public static void main(String[] args) {

		// creating the thread object
		Program t1 = new Program();
		Program t2 = new Program();

		// changing the thread object name
		t1.setName("printNum");
		t2.setName("printChar");

		// calling the start() which calls run()
		t1.start();
		t2.start();
	}

}
