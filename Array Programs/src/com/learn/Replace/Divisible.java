package com.learn.Replace;

import java.util.Scanner;

public class Divisible {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter the Array Size : ");
	int [] arr = new int[scanner.nextInt()];
	
	
	System.out.println("Enter the elements : ");
	for(int i = 0;i<=arr.length-1;i++)
	{
		arr[i] = scanner.nextInt();
	}
	
	System.out.print("Array before replace : ");
	for(int i = 0;i<=arr.length-1;i++)
	{
		System.out.print(arr[i]+" ");
	}
	
	System.out.println();
	
	for(int i = 0;i<=arr.length-1;i++)
	{
		if(arr[i]%3==0)
		{
			arr[i] = -1;
		}
	}
	
	
	System.out.print("Array before replace : ");
	for(int i = 0;i<=arr.length-1;i++)
	{
		System.out.print(arr[i]+" ");
	}
	
scanner.close();
	}

}
