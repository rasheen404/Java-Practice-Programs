package com.learn.LinkedList;

import java.util.LinkedList;

public class Program2 {
	public static void main(String[] args) {

		// creating LinkedList object
		LinkedList linkedList = new LinkedList();

		// adding values to Array
		linkedList.add(10);
		linkedList.add(20);
		linkedList.add("Java");
		linkedList.add(98.45F);
		linkedList.add(true);

		// printing the array
		System.out.println(linkedList);

		// modified existing array by inserting 99 into 2nd index
		linkedList.add(2, 99);

		// printing the array
		System.out.println(linkedList);
	}
}

// output [10, 20, Java, 98.45, true]
//[10, 20, 99, Java, 98.45, true]
