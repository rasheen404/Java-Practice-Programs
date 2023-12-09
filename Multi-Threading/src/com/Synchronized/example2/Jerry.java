package com.Synchronized.example2;

public class Jerry implements Runnable {
	Hospital h;

	Jerry(Hospital h)
	{
		this.h=h;
	}

	public void run() {
		h.jerryTreatment();
	}

}