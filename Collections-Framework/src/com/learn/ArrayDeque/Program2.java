package com.learn.ArrayDeque;

import java.util.ArrayDeque;

public class Program2 {

	public static void main(String[] args) {

		// creating LinkedList object
		ArrayDeque arrayDeque = new ArrayDeque();

		// adding values to Array
		arrayDeque.add(10);
		arrayDeque.add(20);
		arrayDeque.add("Java");
		arrayDeque.add(98.45F);
		arrayDeque.add(true);

		// printing the array
		System.out.println(arrayDeque);

		// adding value in first index
		arrayDeque.addFirst(0);
		System.out.println(arrayDeque);

		// adding value in last index
		arrayDeque.addLast(100);
		System.out.println(arrayDeque);
	}

}

//output [10, 20, Java, 98.45, true]
//[0, 10, 20, Java, 98.45, true]
//[0, 10, 20, Java, 98.45, true, 100]
