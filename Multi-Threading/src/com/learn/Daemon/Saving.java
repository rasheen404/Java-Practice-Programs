package com.learn.Daemon;

public class Saving extends Thread {
	public void run() {
		try {
			//infinity Loop
			for ( ; ; ) {
				System.out.println("Saving the code.");
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
