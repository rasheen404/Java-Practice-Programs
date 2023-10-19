package com.learn.StudentCompleteOrNot;

import java.util.Scanner;

public class Project {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of classes: ");
		
		String [][] arr = new String[scan.nextInt()][];
		
		
		for (int i = 0;i<=arr.length-1;i++)
		{
			
			System.out.println("Enter the students in class " +(i+1)+" : ");
			arr[i] = new String [scan.nextInt()];
		}
		
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0 ; j<=arr[i].length-1;j++)
			{
				System.out.println("Whether class "+(i+1)+" Student "+(j+1)+" Have completed the project ? : ");
				boolean status = scan.nextBoolean();
				
				if (status == true)
				{
					arr[i][j] = "YES";
				}
				else {
					arr[i][j] = "NO";
				}
			}
		}
		
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0 ; j<=arr[i].length-1;j++)
			{
				System.out.println(arr[i][j]);
			}
		}
		
scan.close();
	}

}
