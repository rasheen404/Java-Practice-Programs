package com.learn.StudentApp;



class Student {
	
	private int RollNo;
	private String Name;
	private int Age;
	
	public void setData(int x,String y,int z)
	{
		RollNo = x;
		Name = y;
		Age = z;
	}
	
	public int getRollNo()
	{
		return RollNo;
	}
	public String getName()
	{
		return Name;
	}
	public int getAge()
	{
		return Age;
	}

}
