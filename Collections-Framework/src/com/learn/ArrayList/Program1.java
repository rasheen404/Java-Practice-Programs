package com.learn.ArrayList;

import java.util.ArrayList;

public class Program1 {
	public static void main(String[] args) {

		// creating ArrayList object
		ArrayList arrayList = new ArrayList();

		// adding values to Array
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add("Java");
		arrayList.add(98.45F);
		arrayList.add(true);

		// printing the array
		System.out.println(arrayList);
	}
}

//output [10, 20, Java, 98.45, true]