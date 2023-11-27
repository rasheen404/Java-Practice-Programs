package com.learn.Laptop;
public class LaptopApp {


	public static void main(String[] args) {
		Laptop e1 = new Laptop("i5",8);

		System.out.print(e1.getProcessor()+" ");
		System.out.print(e1.getMemorySize());
		
		System.out.println();
		Laptop e2 = new Laptop("i9",32);

		System.out.print(e2.getProcessor()+" ");
		System.out.print(e2.getMemorySize());
	}





}
