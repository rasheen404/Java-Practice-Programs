package com.ConsumerProduction.example;

public class Consumer extends Thread {
	Factory f;

	public Consumer(Factory f) {
		this.f = f;
	}

	public void run() {
		while (true) {
			f.get();

		}
	}
}
