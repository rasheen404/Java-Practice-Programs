package com.MultiThreading.example1;

public class PrintChar extends Thread{
	public  void run()
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
