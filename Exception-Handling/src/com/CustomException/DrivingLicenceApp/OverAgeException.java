package com.CustomException.DrivingLicenceApp;

public class OverAgeException extends Exception{
	
	public OverAgeException()
	{
		System.out.println("You are too old,take Rest.");
	}

}