package com.MuliThreading.Synchronized;

public class KodNestLibraryApp {
public static void main(String[] args) {
	KodNestLibrary kl  = new KodNestLibrary();
	Thread t1 = new Thread(kl);
	Thread t2 = new Thread(kl);
	
	t1.setName("Tom");
	t2.setName("Jerry");
	
	t1.start();
	t2.start();
}
}
