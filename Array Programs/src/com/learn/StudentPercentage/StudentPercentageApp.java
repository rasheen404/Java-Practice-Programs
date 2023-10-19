package com.learn.StudentPercentage;

import java.util.Scanner;

public class StudentPercentageApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of Students : ");
		int n = scan.nextInt();
		//Creating the Array
		float [] arr = new float [n];
		
		//Storing the Data in Array
		
		for(int i = 0;i<=n-1;i++)
		{
			System.out.println("Enter the Percentage of student "+(i+1));
			arr[i] = scan.nextFloat();
		}
		
		//Printing the Array stored value.
		for(int i = 0;i<=n-1;i++)
		{
			System.out.println("The Percentage of "+(i+1)+" is : "+arr[i]+" ");		
		} 
		scan.close();
	}

}
