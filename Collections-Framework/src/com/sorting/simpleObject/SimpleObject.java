package com.sorting.simpleObject;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

public class SimpleObject {
	public static void main(String[] args) {
		ArrayDeque aDeque = new ArrayDeque();

		aDeque.add(10);
		aDeque.add(50);
		aDeque.add(30);
		aDeque.add(20);
		aDeque.add(40);

		System.out.println(aDeque);

		ArrayList arrayList = new ArrayList();

		arrayList.addAll(aDeque);

		Collections.sort(arrayList);

		aDeque.clear();

		aDeque.addAll(arrayList);

		System.out.println(aDeque);
	}

}
