package com.learn.Operations;

import java.util.Scanner;

public class Multiplication {
public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in);
	
	System.out.println("Enter the size of array :");
	int[] arr = new int[scanner.nextInt()];
	
	for(int i=0;i<=arr.length-1;i++)
	{
		arr[i] = scanner.nextInt();
	}
	
	int mul = 1;
	
	for(int i=0;i<=arr.length-1;i++)
	{
		mul *=arr[i];
	}
	System.out.println(mul);
	
	scanner.close();
}
}
