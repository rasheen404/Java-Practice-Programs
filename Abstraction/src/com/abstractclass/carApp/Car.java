package com.abstractclass.carApp;

abstract public class Car {
	void start()
	{
		System.out.println("Car is getting Started.");
	}
	
	void stop()
	{
		System.out.println("Car is getting Stopped.");
	}
	
	abstract void refuel();
}
