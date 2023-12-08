package com.learn.JoinMethod;

public class Reel extends Thread{

	public void run() {
		try {
			System.out.println("creating a reel");
			Thread.sleep(2000);
			System.out.println("posting a reel");
			Thread.sleep(2000);
			System.out.println("reel is uploaded");
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
