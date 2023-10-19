package com.learn.Operations;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	int [] arr = new int[scan.nextInt()];
	
	for(int i=0;i<=arr.length-1;i++)
	{
		arr [i] = scan.nextInt();
	}
	
	int sum = 0;
	for(int i=0;i<=arr.length-1;i++)
	{
		sum += arr[i];
		
	}
	System.out.println(sum);
	
	scan.close();
	}

}
