package com.learn.PriorityQueue;

import java.util.PriorityQueue;

public class Program2 {

	public static void main(String[] args) {
		PriorityQueue<Integer> pQueue1 = new PriorityQueue<Integer>();

		pQueue1.add(50);
		pQueue1.add(30);
		pQueue1.add(40);
		pQueue1.add(10);
		pQueue1.add(20);

		System.out.println(pQueue1);

		PriorityQueue<String> pQueue2 = new PriorityQueue<String>();

		pQueue2.add("hello");
		pQueue2.add("hai");
		pQueue2.add("hey");
		pQueue2.add("namasthe");

		System.out.println(pQueue2);

	}

}
