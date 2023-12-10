package com.ConsumerProduction.example;

public class Production extends Thread {

	Factory f;

	public Production(Factory f) {
		this.f = f;
	}

	public void run() {
		int i = 1;
		while (true) {
			f.put(i += 1);

		}
	}

}
