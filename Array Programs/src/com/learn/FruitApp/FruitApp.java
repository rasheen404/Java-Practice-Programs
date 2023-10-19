package com.learn.FruitApp;

import java.util.Scanner;

public class FruitApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number of Fruits : ");
		int n = scan.nextInt();
		
		//Creating the Array
		String [] arr = new String [n];
		
		//Storing the Data in Array
		for(int i = 0;i<n;i++)
		{
			System.out.print("Enter the name of fruit of "+(i+1)+": ");
			arr[i] = scan.next();
		}
		
		//Printing the Array stored value.
		for(int i = 0;i<n;i++)
		{
			System.out.println((i+1)+" Fruit name is : "+arr[i]);		
		} 
	scan.close();
	}



}
