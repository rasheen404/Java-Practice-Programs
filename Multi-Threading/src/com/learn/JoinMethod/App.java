package com.learn.JoinMethod;

public class App {
	public static void main(String[] args) {

		try {

			System.out.println("App is Opened");
			Chatting chatting = new Chatting();
			Reel reel = new Reel();

			chatting.start();
			reel.start();

			chatting.join();
			reel.join();

			System.out.println("App is closed.");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
