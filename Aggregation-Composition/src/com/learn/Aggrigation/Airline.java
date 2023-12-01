package com.learn.Aggrigation;

public class Airline {
	String airlineName;
	Pilot pilot;
	public Airline(String airlineName,Pilot pilot) {
		this.airlineName=airlineName;
		this.pilot=pilot;
	}
	void activity()
	{
		System.out.println(airlineName+" is doing Activity.");
		pilot.fly();
	}
	

}
