package com.learn.Company;


import java.util.Scanner;

public class ProjectAssigned {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter the no:of Branch : ");
	int branch = scanner.nextInt();
	
	System.out.println("Enter the no:of Teams : ");
	int teams = scanner.nextInt();
	
	System.out.println("Enter the no:of Employee : ");
	int employee = scanner.nextInt();
	
	String [][][] arr = new String[branch][teams][employee];
	
	for(int i = 0 ;i<=branch-1;i++)
	{
		for(int j = 0;j<=teams-1;j++)
		{
			for(int k = 0 ; k<=employee-1;k++)
			{
				System.out.println("Enter the Name  of Employee "+(k+1)+" of Team "+(j+1)+" of branch "+(i+1)+" : ");
				arr [i][j][k] = scanner.next();
			}
		}
	}
	
	
	for(int i = 0 ;i<=branch-1;i++)
	{
		for(int j = 0;j<=teams-1;j++)
		{
			for(int k = 0 ; k<=employee-1;k++)
			{
				System.out.println("The Name of Employee "+(k+1)+" of Team "+(j+1)+" of Branch "+(i+1)+" is : "+arr[i][j][k]);
			}
		}
	}
	
	
	scanner.close();
}
}
