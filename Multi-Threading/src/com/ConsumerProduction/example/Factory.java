package com.ConsumerProduction.example;

public class Factory {
	int x;
	boolean status = false;

	synchronized public void put(int a) {
		try {
			if (status == false) {

				x = a;
				System.out.println("The value store in x :" + x);
				status = true;
				notify();
			} else {
				wait();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	synchronized public void get() {
		try {
			if (status == true) {

				System.out.println("The value got from x :" + x);
				status = false;
				notify();
			} else {
				wait();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
