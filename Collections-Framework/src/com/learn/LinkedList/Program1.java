package com.learn.LinkedList;

import java.util.LinkedList;

public class Program1 {
	public static void main(String[] args) {

		// creating LinkedList object
		LinkedList linkedList = new LinkedList();

		// adding values to Array
		linkedList.add(10);
		linkedList.add(20);
		linkedList.add("Java");
		linkedList.add(98.45F);
		linkedList.add(true);

		// printing the LinkedList
		System.out.println(linkedList);
	}
}

//output [10, 20, Java, 98.45, true]