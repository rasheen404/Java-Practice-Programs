package com.learn.EvenIndex;

import java.util.Scanner;

public class EvenIndex {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in); 

		System.out.println("Enter the size of the array : ");
		int [] arr = new int[scanner.nextInt()];
		
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i] = scanner.nextInt();
		}
		
		for(int i= 0; i<=arr.length-1;i++)
		{
			if((i+1)%2 ==0)
			{
				System.out.println(arr[i]);
			}
		}
scanner.close();
	}

}
