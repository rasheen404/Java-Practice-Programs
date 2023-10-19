package com.learn.PrimeNum;

import java.util.Scanner;

public class PrimeApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = scan.nextInt();
		
		for(int i = 2;i<=n;i++)
		{
			int result = PrimeNum.FindPrime(i);
			
			if (result != -1)
			{
				System.out.print(i + " ");
			}
		
		
		}
		scan.close();
	}

}
