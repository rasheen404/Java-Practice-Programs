package com.learn.MergeArrays;

import java.util.Scanner;

public class MergeArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the array size of First : ");
		int [] arr1 = new int [scanner.nextInt()];
		
		System.out.print("Enter the array size of second : ");
		int [] arr2 = new int [scanner.nextInt()];
		
		for(int i = 0;i<=arr1.length-1;i++)
		{
			arr1[i] = scanner.nextInt();
		}
		
		for(int i = 0;i<=arr2.length-1;i++)
		{
			arr2[i] = scanner.nextInt();
		}
		
		int [] arr3 = new int [(arr1.length + arr2.length)];
		
		for (int i=0;i<=arr1.length-1;i++)
		{
			arr3[i]=arr1[i];
		}
		
		int j=arr1.length;
		for(int i = 0;i<=arr2.length-1;i++)
		{
			arr3[j] = arr2[i];
			
			j++;
			
		}
		System.out.print("First array elements are : ");
		for(int x:arr1)
		{
			System.out.print(x+ " ");
		}
		
		System.out.println();
		
		System.out.print("Second array elements are : ");
		for(int x:arr2)
		{
			System.out.print(x+ " ");
		}
		
		System.out.println();
		
		System.out.print("Merged array elements are : ");
		for(int x:arr3)
		{
			System.out.print(x+" ");
		}
				
		scanner.close();
	}
}
