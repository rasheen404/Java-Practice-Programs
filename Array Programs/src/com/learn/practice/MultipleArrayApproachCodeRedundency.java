package com.learn.practice;

import java.util.Scanner;

public class MultipleArrayApproachCodeRedundency {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int [][] arr = new int[3][3];
		
		for(int i = 0; i<=3-1;i++) {
			 for (int j = 0 ;j<=3-1;j++)
			 {
				 System.out.print("Enter the element for "+(i+1)+" Row "+(j+1)+"Column :");
				 arr[i][j] = scan.nextInt();
			 }
		}
		
		for(int i = 0; i<=3-1;i++) {
			 for (int j = 0 ;j<=3-1;j++)
			 {
				 System.out.print("The element of "+(i+1)+" Row "+(j+1)+"Column is :"+ arr[i][j]);
			 }
		}
		scan.close();
	}

}
