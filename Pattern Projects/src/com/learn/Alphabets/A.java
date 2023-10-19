package com.learn.Alphabets;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Character : ");
		char ch = scan.next().charAt(0);
		
		System.out.println("Enter the Number : ");
		int n = scan.nextInt();
		
		for(int i = 0;i<=n-1;i++)
		{
			for(int j=0;j<=n-1;j++)
			{
				if(j==0|| i==0|| i==n/2 || j==n-1)
				{ 
					System.out.print(ch);
				}
				else  {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	scan.close();
	}







}
