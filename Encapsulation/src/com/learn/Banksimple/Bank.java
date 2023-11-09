package com.learn.Banksimple;
class Bank {
private  int money;

public void setMonet(int amount)
{
	if(amount>0)
	{
	money = amount;
	}
	else {
		System.out.println("Please enter a valid amount.");
		System.exit(0);
		
	}
}
public int getMoney()
{
	return money;
}
}
