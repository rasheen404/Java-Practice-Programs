package com.learn.whetherAverage;

import java.util.Scanner;


public class whetherAverage {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int [] arr = new int [7];
		
		System.out.println("Enter the & days wheather : ");
		for(int i = 0;i<=arr.length-1;i++)
		{
			arr[i] = scanner.nextInt();
		}
		int sum = 0;
		
		for(int i = 0;i<=arr.length-1;i++)
		{
			sum +=arr[i];
		}
		
		int average  = sum/7;
		
		System.out.println("The average wheather of week is : "+average);
	
		scanner.close();
	}

}
