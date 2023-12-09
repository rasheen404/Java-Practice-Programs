package com.MuliThreading.Synchronized;

public class KodNestLibrary implements Runnable{
synchronized public void run()
{
	try {
		
		System.out.println(Thread.currentThread().getName()+" is taking the KodNest book.");
		Thread.sleep(2000);
		System.out.println(Thread.currentThread().getName()+" is reading the KodNest book.");
		Thread.sleep(2000);
		System.out.println(Thread.currentThread().getName()+" is returning the KodNest book.");
		Thread.sleep(2000);
		
	} catch (Exception e) {

e.printStackTrace();
	}
}
}
