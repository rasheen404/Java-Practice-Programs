package com.learn.HeightOfPlayers;

import java.util.Scanner;

public class HightOfPlayers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number of Players : ");
		
		float [] arr = new float[scan.nextInt()]; 
		
		
		
		for(int i=0; i<=arr.length-1;i++)
		{
			System.out.println("Enter the Height of player "+(i+1));
			arr[i] = scan.nextFloat();
		}
		
		for(int i=0; i<=arr.length-1 ;i++)
		{
			
			System.out.println("The Height of player "+(i+1)+" is : "+arr[i]);
		}
	
	scan.close();
	}

}
