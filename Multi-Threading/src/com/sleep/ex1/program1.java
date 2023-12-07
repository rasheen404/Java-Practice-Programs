package com.sleep.ex1;

public class program1 {

	public static void main(String[] args) {
		PrintNum();
		PrintChar();
	}
		
	
	public static void PrintNum()
	{
		System.out.println("Number started Printing");
		for(int i =1 ;i<=5;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		System.out.println("Number Ended Printing");
	}
	
	public static void PrintChar()
	{
		System.out.println("Character started Printing");
		for(char i ='A' ;i<='E';i++)
		{
			System.out.println(i);

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			
		}
	}
		System.out.println("Character Ended Printing");
	}
}
