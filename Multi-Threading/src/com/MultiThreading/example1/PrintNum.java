package com.MultiThreading.example1;

public class PrintNum extends Thread{
	public  void run()
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

}
