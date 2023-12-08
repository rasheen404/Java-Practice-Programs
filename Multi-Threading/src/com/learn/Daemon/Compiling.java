package com.learn.Daemon;

public class Compiling extends Thread {
	public void run() {
		try {
			//infinity Loop
			for ( ; ; ) {
				System.out.println("Compiling the code.");
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
