package com.learn.ThreeDimentionarray;

import java.util.Scanner;

public class StudentAge {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int university = 2;
		int classroom  = 3 ;
		int Student = 5;
		
		int [][][] arr = new int[university][classroom][Student];
		
		for(int i = 0 ;i<=university-1;i++)
		{
			for(int j = 0;j<=classroom-1;j++)
			{
				for(int k = 0 ; k<=Student-1;k++)
				{
					System.out.println("Enter the Age of Student "+(k+1)+" of classroom "+(j+1)+" of university "+(i+1)+" : ");
					arr [i][j][k] = scanner.nextInt();
				}
			}
		}
		
		
		for(int i = 0 ;i<=university-1;i++)
		{
			for(int j = 0;j<=classroom-1;j++)
			{
				for(int k = 0 ; k<=Student-1;k++)
				{
					System.out.println("The Age of Student "+(k+1)+" of classroom "+(j+1)+" of university "+(i+1)+" is : "+arr[i][j][k]);
				}
			}
		}


scanner.close();
	}

}
