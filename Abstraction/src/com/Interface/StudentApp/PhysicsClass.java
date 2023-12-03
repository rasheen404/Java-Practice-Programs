package com.Interface.StudentApp;

public class PhysicsClass implements StudentActivity{
	
	@Override
	public void attendClass()
	{
		System.out.println("Physics student is attending the Meeting.");
	}
	@Override
	public void study()
	{
		System.out.println("Physics student is studying Physics.");
	}
	
	@Override
	public void assignment()
	{
		System.out.println("Physics student is doing Physics assignment.");
	}

}
