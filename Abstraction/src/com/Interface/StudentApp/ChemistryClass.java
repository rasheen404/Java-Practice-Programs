package com.Interface.StudentApp;

class ChemistryClass implements StudentActivity{
	
	@Override
	public void attendClass()
	{
		System.out.println("Chemistry student is attending the Meeting.");
	}
	@Override
	public void study()
	{
		System.out.println("Chemistry student is studying chemistry.");
	}
	
	@Override
	public void assignment()
	{
		System.out.println("Chemistry student is doing chemistry assignment.");
	}

}
