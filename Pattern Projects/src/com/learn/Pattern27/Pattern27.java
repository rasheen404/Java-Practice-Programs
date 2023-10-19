package com.learn.Pattern27;

import java.util.Scanner;

public class Pattern27 {
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
				if(i==j)
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
