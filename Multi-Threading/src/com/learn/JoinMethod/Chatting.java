package com.learn.JoinMethod;

public class Chatting extends Thread {

	public void run() {
		try {
			System.out.println("chatting is started.");
			Thread.sleep(2000);
			System.out.println("chatting is happening.");
			Thread.sleep(2000);
			System.out.println("chatting is ended.");
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
