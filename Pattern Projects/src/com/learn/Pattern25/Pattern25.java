package com.learn.Pattern25;

import java.util.Scanner;

public class Pattern25 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Character : ");
		char ch = scan.next().charAt(0);
		
		System.out.println("Enter the Number : ");
		int n = scan.nextInt();
		
		for(int i = 0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(i==0 || i == n || j==0 || j == n )
				{
					System.out.print(ch);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	scan.close();
	}




}
