package com.learn.TheJourneyCalculator;

import java.util.Scanner;

public class TheJourneyCalculatorApp {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Speed : ");
		float speed = scan.nextFloat();
		
		System.out.println("Enter the Time : ");
		float time = scan.nextFloat();
		
		Calculator journeyCalculator = new Calculator(); 
		double dist = journeyCalculator.calculateDistance(speed, time); 
		
		System.out.println(dist);
		
		scan.close();
	}

}
