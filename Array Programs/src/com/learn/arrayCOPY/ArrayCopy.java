package com.learn.arrayCOPY;


import java.util.Scanner;

public class ArrayCopy {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in); 

		System.out.println("Enter the size of the array : ");
		int [] arr1 = new int[scanner.nextInt()];
		
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr1[i] = scanner.nextInt();
		}
		
		int [] arr2 = new int[arr1.length];
		
		for(int i=0;i<=arr2.length-1;i++)
		{
			arr2[i]=arr1[i];
		}
		System.out.println("Copied Arrays are : ");
		for(int i = 0;i<=arr2.length-1;i++)
		{
			System.out.println(arr2[i]);
		}
		
		scanner.close();
	}

}
