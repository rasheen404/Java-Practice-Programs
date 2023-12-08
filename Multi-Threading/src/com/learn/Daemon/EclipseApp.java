package com.learn.Daemon;

public class EclipseApp {
	public static void main(String[] args) {
		Typing typing = new Typing();
		Saving saving = new Saving();
		Compiling compiling = new Compiling();

		compiling.setDaemon(true);
		saving.setDaemon(true);

		typing.start();
		compiling.start();
		saving.start();
	}

}
