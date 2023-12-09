package com.Synchronized.example2;

public class Tom implements Runnable {
	Hospital h;

	Tom(Hospital h) {
		this.h = h;
	}

	public void run() {
		h.tomTreatment();
	}

}
