package com.learn.Aggrigation;

public class AirlineApp {

	public static void main(String[] args) {
		Pilot pilot = new Pilot("Raju");
		pilot.fly();
		Airline airline=new Airline("KodAir", pilot);
		airline.activity();

	}

}
