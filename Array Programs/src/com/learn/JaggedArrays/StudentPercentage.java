package com.learn.JaggedArrays;

import java.util.Scanner;

public class StudentPercentage {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Enter the Number of classes : ");
	int row = scan.nextInt();
	
	
	float [][] arr = new float[row][];
	
	for(int i = 0;i<=row-1;i++)
	{
		System.out.println("Enter the Number of Students in "+(i+1)+" : ");
		arr[i] = new float[scan.nextInt()];
	}
	
	System.out.println("Enter the percentage of students : ");
	for(int i=0;i<=row-1;i++)
	{
		for(int j =0;j<=arr[i].length-1;j++)
		{

			arr[i][j] = scan.nextFloat();
		}
	}
	
	System.out.println("The percentage of students are : ");
	for(int i=0;i<=row-1;i++)
	{
		for(int j =0;j<=arr[i].length-1;j++)
		{
			System.out.println(arr[i][j]);
		}
	}
	
	scan.close();
}
}
