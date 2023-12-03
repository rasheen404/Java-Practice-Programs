package com.abstractclass.carApp;

public class CarApp {
	
	public static void  doActivity(Car car)
	{
		car.start();
		car.stop();
		car.refuel();
	}
	public static void main(String[] args) {
		ElectricCar electricCar = new ElectricCar();
		PetrolCar petrolCar = new PetrolCar();
		DieselCar dieselCar = new DieselCar();
		
		doActivity(electricCar);
		System.out.println("--------------------------------------------");
		doActivity(petrolCar);
		System.out.println("--------------------------------------------");
		doActivity(dieselCar);
		
	}

}
